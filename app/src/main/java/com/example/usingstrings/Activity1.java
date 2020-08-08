package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Activity1 extends AppCompatActivity {

    TextView txtView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);


        Log.i("Lifecycle","OnCreate() invoked");


        txtView2 = findViewById(R.id.textView5);
        txtView2.setText(R.string.Msg2);

        //textView5 is used due to  mistakenly creating 5 textviews
    }
    public void onStart() {

        super.onStart();
        Log.i("Lifecycle","OnStart() invoked");

    }
    public void onRestart() {

        super.onRestart();
        Log.i("Lifecycle","OnRestart() invoked");

    }
    public void onResume() {

        super.onResume();
        Log.i("Lifecycle","onResume() invoked");

    }



}