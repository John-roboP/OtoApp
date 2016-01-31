package com.t_robop.otaka.otoapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class StartMainActivity extends AppCompatActivity {
    MediaPlayer se;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_main);
        se = MediaPlayer.create(getApplicationContext(), R.raw.hakusyu); //音源入手
        //TextView tv= (TextView) findViewById(R.id.txtV);
    }
    public void otobutton(View view){
      //  bgm.setLooping(true);
        se.start();     //音を流す

    }
}
