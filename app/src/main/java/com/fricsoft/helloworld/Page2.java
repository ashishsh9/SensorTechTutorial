package com.fricsoft.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Page2 extends AppCompatActivity {


    TextView displayObj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);


        String str = getIntent().getStringExtra("DataSent");
        displayObj = findViewById(R.id.displayText);
        displayObj.setText(str);

    }
}