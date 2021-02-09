package com.fricsoft.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textVariable ;

    EditText editVariable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textVariable = findViewById(R.id.textView2);

        editVariable = findViewById(R.id.editText);
    }

    public void clickFunction(View v){

        String myString = editVariable.getText().toString();
        textVariable.setText(myString);

    }

    public void clickFuctionPage2(View v){
        //To Call a new Activity
        Intent iObj = new Intent(MainActivity.this, Page2.class);
        String str = editVariable.getText().toString();
        iObj.putExtra("DataSent", str);
        startActivity(iObj);





    }



}