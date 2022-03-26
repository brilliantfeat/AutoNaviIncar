package np;
/**
 * Created by brilliant on 2022/3/26.
 */
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import android.hardware.display.DisplayManager;
import android.widget.Toast;

public class Brilliant {
    public static boolean sss;
    static  boolean isuri;
    public static int ucarDisplayID;
    public Brilliant() {
    }

    public static void show(Activity activity) {
        isuri=false;
        //准备接收jovi发给百度地图的uri
        Uri uri = activity.getIntent().getData();
        //如果收到的是百度地图导航的uri：
        // 这里注意，如果还有其它app给百度地图app发uri，也会被高德车机版接收
        if (uri != null) {
            isuri=true;
            Intent intent2 = new Intent();
            //准备广播
            //广播添加各种从百度地图uri提取的信息，这些如果需要请自行查找高德地图车机版api
            intent2.setAction("AUTONAVI_STANDARD_BROADCAST_RECV");
            String path = uri.getPath();
            if (path.equals("/navi/common")) {
                //回家
                if (uri.getQueryParameter("addr").equals("home")) {
                    intent2.putExtra("KEY_TYPE", 10040);
                    intent2.putExtra("SOURCE_APP", "com.vivo.carlink");
                    intent2.putExtra("DEST", 0);
                    intent2.putExtra("IS_START_NAVI", 0);
                //公司
                } else {
                    intent2.putExtra("KEY_TYPE", 10040);
                    intent2.putExtra("SOURCE_APP", "com.vivo.carlink");
                    intent2.putExtra("DEST", 1);
                    intent2.putExtra("IS_START_NAVI", 0);
                }
                //其它给定经纬度的地点，没有提取poi名称
            } else if (path.equals("/navi")) {
                String jwd = uri.getQueryParameter("location");
                double wd = Double.parseDouble(jwd.substring(0, jwd.indexOf(",") - 1));
                double jd = Double.parseDouble(jwd.substring(jwd.indexOf(",") + 1, jwd.length() - 1));
                try {
                    //这里百度地图坐标系转高德，不转换终点语音导航会有偏移
                    if (!uri.getQueryParameter("coord_type").equals("gcj02")) {
                        double x = jd - 0.0065d;
                        double y = wd - 0.006d;
                        double z = Math.sqrt((x * x) + (y * y)) - (2.0E-5d * Math.sin(y * 52.35987755982988d));
                        double theta = Math.atan2(y, x) - (3.0E-6d * Math.cos(x * 52.35987755982988d));
                        jd = z * Math.cos(theta);
                        wd = z * Math.sin(theta);
                    }
                } catch (Exception e) {
                    double x2 = jd - 0.0065d;
                    double y2 = wd - 0.006d;
                    double z2 = Math.sqrt((x2 * x2) + (y2 * y2)) - (2.0E-5d * Math.sin(y2 * 52.35987755982988d));
                    double theta2 = Math.atan2(y2, x2) - (3.0E-6d * Math.cos(x2 * 52.35987755982988d));
                    jd = z2 * Math.cos(theta2);
                    wd = z2 * Math.sin(theta2);
                }
                intent2.putExtra("KEY_TYPE", 10038);
                intent2.putExtra("SOURCE_APP", "com.vivo.carlink");
                intent2.putExtra("LON", jd);
                intent2.putExtra("LAT", wd);
                intent2.putExtra("DEV", 0);
                intent2.putExtra("STYLE", -1);
            }
            activity.sendBroadcast(intent2);
        }
        //查找屏幕
        DisplayManager displayManager = (DisplayManager) activity.getSystemService(activity.DISPLAY_SERVICE);
        Display[] displays = displayManager.getDisplays(DisplayManager.DISPLAY_CATEGORY_PRESENTATION);
        if (displays.length>0){
            for (int i=0;i<displays.length;i++){
                if (displays[i].getName().equals("vivo_car_screen")){
                    ucarDisplayID=displays[i].getDisplayId();
                }
            }
        }
    }
    //判断是否小窗
    public static void isUcar(Activity activity) {
        sss=false;
        if(!isuri){
            try{
                Intent intent = activity.getIntent();

                String action=intent.getAction();
                if(action.equals("com.ucar.intent.action.UCAR")){
                    sss=true;
                }
                else{
                    sss=false;
                }
            }
            catch (Exception e){

            }
        }
    }

}