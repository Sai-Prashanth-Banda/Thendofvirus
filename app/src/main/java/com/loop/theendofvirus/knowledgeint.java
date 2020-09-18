package com.loop.theendofvirus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class knowledgeint extends AppCompatActivity {
    ImageButton toi,aaj,telugu,tamil,kannada,malayalam,marathi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knowledgeint);
        toi=findViewById(R.id.toi);
        telugu=findViewById(R.id.tv9);
        tamil=findViewById(R.id.tamil);
        kannada=findViewById(R.id.kannada);
        malayalam=findViewById(R.id.malayalam);
        marathi=findViewById(R.id.marathi);
        aaj=findViewById(R.id.aaj);
        toi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://timesofindia.indiatimes.com/"));
                startActivity(intent);
            }
        });
        aaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("https://aajtak.intoday.in/"));
                startActivity(intent1);
            }
        });
        telugu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("https://tv9telugu.com/breaking-news"));
                startActivity(intent1);
            }
        });
        tamil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("https://tamil.samayam.com/"));
                startActivity(intent1);
            }
        });
        kannada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("https://kannada.news18.com/"));
                startActivity(intent1);
            }
        });
        malayalam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("https://www.manoramanews.com/home.html"));
                startActivity(intent1);
            }
        });
        marathi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("https://marathi.abplive.com/"));
                startActivity(intent1);
            }
        });
    }
}