package com.loop.theendofvirus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class symptomsint extends AppCompatActivity {
    ImageButton hospitals,micro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptomsint);
        hospitals=findViewById(R.id.hospitals);
        micro=findViewById(R.id.micro);
        hospitals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.google.com/maps/search/hospitals+near+me/@17.3724201,78.53201,15z/data=!3m1!4b1"));
                startActivity(intent);
            }
        });
        micro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.google.com/maps/search/microbiologist+hospitals+near+me/@17.3724195,78.5232552,14z/data=!3m1!4b1"));
                startActivity(intent);
            }
        });
    }
}