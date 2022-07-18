package com.androidst.myapplication7;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {
ImageView clean,software,electrical,hardware;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        clean = findViewById(R.id.cleaning);
        clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendimage = new Intent(HomeActivity.this,cleaning.class);
                startActivity(sendimage);
            }
        });
        electrical= findViewById(R.id.electrical);
        electrical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendimage = new Intent(HomeActivity.this,cleaning.class);
                startActivity(sendimage);
            }
        });
        hardware= findViewById(R.id.hardware);
        hardware.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendimage = new Intent(HomeActivity.this,cleaning.class);
                startActivity(sendimage);
            }
        });

        software= findViewById(R.id.softwaredeveloper);
        software.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendimage = new Intent(HomeActivity.this,cleaning.class);
                startActivity(sendimage);
            }
        });

    }
}