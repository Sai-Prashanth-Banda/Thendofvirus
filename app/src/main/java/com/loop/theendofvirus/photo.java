package com.loop.theendofvirus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class photo extends AppCompatActivity {
    ImageButton imagesai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);
        imagesai = findViewById(R.id.imagesai);
        imagesai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launchintent=getPackageManager().getLaunchIntentForPackage("com.loop.mylocation");
                if(launchintent!=null){
                    startActivity(launchintent);}
            }
        });
    }}

