package com.autonavi.auto.remote.fill;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import np.Brilliant;
/**
 * Created by brill on 2022/3/26.
 */

public class UsbFillActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //添加我们自己的代码
        Brilliant.show(this);
        Brilliant.isUcar(this);

    }
}
