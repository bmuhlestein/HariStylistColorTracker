package com.example.muhlestein.haristylistcolortracker;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainLogin extends AppCompatActivity {

    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);

        t= (TextView) findViewById(R.id.my_text);
        Typeface myCustomFont=Typeface.createFromAsset(getAssets(), "fonts/PinkClouds.ttf");
        t.setTypeface(myCustomFont);

    }
}
