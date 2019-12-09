package com.example.start_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class Loading extends AppCompatActivity {

    ImageView im_01;
    TextView tv_01,tv_02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_loading);
        im_01 = (ImageView)findViewById(R.id.im_01);
        tv_01 = (TextView)findViewById(R.id.tv_01);
        tv_02 = (TextView)findViewById(R.id.tv_02);
        loading();
    }
    public void loading()
    {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Loading.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);

    }
}
