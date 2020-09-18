package com.loop.theendofvirus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;

public class First extends AppCompatActivity {
    ProgressBar progressBar;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        progressBar = findViewById(R.id.progress);
        textView = findViewById(R.id.text_view);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        progressBar.setMax(100);
        progressBar.setScaleY(3f);
        Firstani();
    }
    public void Firstani(){
        Firstani animation=new Firstani(this,progressBar,textView,0f,100f);
        animation.setDuration(3000);
        progressBar.setAnimation(animation);
    }
    }