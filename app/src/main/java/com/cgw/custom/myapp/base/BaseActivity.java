package com.cgw.custom.myapp.base;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.Window;

import com.cgw.custom.myapp.R;

import MyApplication.MyApp;
import butterknife.ButterKnife;

/**
 * Author：陈国武
 * Time：2016/12/21 17:37
 */

public abstract class BaseActivity extends FragmentActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //强制竖屏
        if(getRequestedOrientation()!= ActivityInfo.SCREEN_ORIENTATION_PORTRAIT){
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }
        //设置自定义标题布局 标题样式在application的AppTheme定义
        //第一步
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        //第二步
        setContentView(setContentView());
        //第三步  这三步顺序是固定的
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.layout_title);
        MyApp.getI().addActivity(this);
    }

    protected abstract int setContentView();
    protected abstract void initUI();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
        MyApp.getI().finishActivity(this);
    }
}
