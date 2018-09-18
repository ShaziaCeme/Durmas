package com.app1.shazia.durmas;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatTextView;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 4000;

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        new Handler(  ).postDelayed( new Runnable() {
            @Override
            public void run (){
                Intent categoryIntent = new Intent(MainActivity.this, categoryActivity.class  );
                startActivity( categoryIntent );
                finish();
                Log.d("Durmas","Main Intent started");

            }
        }, SPLASH_TIME_OUT);

    }


}
