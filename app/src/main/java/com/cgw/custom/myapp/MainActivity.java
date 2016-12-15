package com.cgw.custom.myapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import Utils.DialogUtils;
import Utils.GlideUtil;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @Bind(R.id.textView2)
    TextView mTextView2;
    @Bind(R.id.imageView)
    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
//        http://img.txt99.cc/Cover/24/24168.jpg
//        mTextView2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                DialogUtils.getI().show(MainActivity.this);
//            }
//        });

        GlideUtil.showImage(this,"http://img.txt99.cc/Cover/24/24168.jpg",mImageView);
    }


    public void ssssss(View v) {
    }

    @OnClick(R.id.textView2)
    public void onClick() {
        DialogUtils.getI().show(MainActivity.this);
    }
}
