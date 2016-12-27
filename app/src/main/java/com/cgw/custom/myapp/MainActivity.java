package com.cgw.custom.myapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.cgw.custom.myapp.base.BaseActivity;

import Utils.DialogUtils;
import Utils.GlideUtil;
import butterknife.Bind;

public class MainActivity extends BaseActivity {


    @Bind(R.id.imageView)
    ImageView mImageView;
    @Bind(R.id.textView2)
    TextView mTextView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    //
    @Override
    protected int setContentView() {
        return R.layout.activity_main;
    }

    @Override
    protected void initUI() {

        mTextView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogUtils.getI().show(MainActivity.this);
            }
        });

        GlideUtil.displayImageFromAct(this, "http://img.txt99.cc/Cover/24/24168.jpg", mImageView);
//        GlideUtil.displayGif(this, "http://i.kinja-img.com/gawker-media/image/upload/s--B7tUiM5l--/gf2r69yorbdesguga10i.gif", mImageView);
//        GlideUtil.displayImageFromAct(this, "http://i.kinja-img.com/gawker-media/image/upload/s--B7tUiM5l--/gf2r69yorbdesguga10i.gif", mImageView);
    }

    @Override
    public void onClick(View view) {

    }


//    @Override
//    protected int setContentView() {
//        return R.layout.activity_main;
//    }
}
