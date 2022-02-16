package com.example.intentwithdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView textenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        textenter =(TextView) findViewById(R.id.textView2);

        Intent change = getIntent();
        Bundle bun=change.getExtras();

        if(bun!=null){
            String array=(String) bun.get("Data");
            textenter.setText(array);
        }
    }
}