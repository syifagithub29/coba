package com.example.coba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


import com.example.coba.Activity2;
import com.example.coba.Activity_new3;
import com.example.coba.Activity_new4;
import com.example.coba.Activity_new5;
import com.example.coba.Activity_6;
import com.example.coba.Activity_new7;
import com.example.coba.R;

public class MainActivity extends AppCompatActivity {

    ImageView ivinstagram, ivwhatsapp, ivtelegram, ivspotify, ivtwitter, ivyoutube;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivinstagram = findViewById(R.id.iv_instagram);

        ivinstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, Activity2.class);
                startActivity(intent);
            }
        });

        ivwhatsapp = findViewById(R.id.iv_whatsapp);
        ivwhatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, Activity_new3.class);
                startActivity(intent);
            }
        });

        ivtelegram = findViewById(R.id.iv_telegram);
        ivtelegram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, Activity_new4.class);
                startActivity(intent);
            }
        });

        ivspotify = findViewById(R.id.iv_spotify);
        ivspotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, Activity_new5.class);
                startActivity(intent);
            }
        });

        ivtwitter = findViewById(R.id.iv_twitter);
        ivtwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, Activity_6.class);
                startActivity(intent);
            }
        });

        ivyoutube = findViewById(R.id.iv_youtube);
        ivyoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, Activity_new7.class);
                startActivity(intent);
            }
        });

    }
}