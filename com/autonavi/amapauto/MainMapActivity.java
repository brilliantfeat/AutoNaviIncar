package com.autonavi.amapauto;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.Display;
import android.view.InputQueue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.autonavi.auto.remote.fill.UsbFillActivity;
import com.example.brill.myapplication.R;

import np.Brilliant;

/**
 * Created by brilliant on 2022/3/26.
 */

public class MainMapActivity extends Activity {
    @Override
    //添加重写dispatchTouchEvent来拦截小窗的点击事件
    public boolean dispatchTouchEvent(MotionEvent ev) {
        try{
            //直接在activity里拦截，点击了小窗就回主页
            if(Brilliant.sss & ev.getAction() == 1) {
                Intent intent=getPackageManager().getLaunchIntentForPackage("com.baidu.BaiduMap");
                intent.setFlags(Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED|Intent.FLAG_ACTIVITY_NEW_TASK);
                ActivityOptions options=ActivityOptions.makeBasic();
                options.setLaunchDisplayId(Brilliant.ucarDisplayID);
                startActivity(intent,options.toBundle());
            }
        }
        catch (Exception e)
        {

        }
        return super.dispatchTouchEvent(ev);
    }
}
