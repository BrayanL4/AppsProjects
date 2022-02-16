package com.example.intentwithdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button) findViewById(R.id.button);
        editText=(EditText) findViewById(R.id.enterdata);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent cambio = new Intent(MainActivity.this, Activity2.class);
        String date = editText.getText().toString();
        cambio.putExtra("Data", date);
        startActivity(cambio);

    }
}