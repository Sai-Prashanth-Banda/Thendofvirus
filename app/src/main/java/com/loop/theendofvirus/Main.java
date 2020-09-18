package com.loop.theendofvirus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Main extends AppCompatActivity {
    ImageButton knowledge,symptoms,precautions;
    Button button;
    TextView textview2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        knowledge=findViewById(R.id.knowledge);
        textview2=findViewById(R.id.textView2);
        button=findViewById(R.id.button);
        precautions=findViewById(R.id.precautions);
        symptoms=findViewById(R.id.symptoms);
        knowledge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(Main.this,knowledgeint.class);
                startActivity(i1);
            }
        });
        symptoms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(Main.this,symptomsint.class);
                startActivity(i2);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent photo=new Intent(Main.this,photo.class);
                startActivity(photo);
            }
        });
        precautions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(Main.this,precautions.class);
                startActivity(i1);
            }
        });
    }
}