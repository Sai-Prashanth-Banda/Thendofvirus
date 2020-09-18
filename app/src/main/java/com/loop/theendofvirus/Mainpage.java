package com.loop.theendofvirus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Mainpage extends AppCompatActivity {
    ImageButton img1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);
        img1=findViewById(R.id.imageButton);
        t1=findViewById(R.id.textView);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(Mainpage.this,First.class);
                startActivity(i1);}
        });}}