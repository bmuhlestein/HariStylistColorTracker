package com.example.muhlestein.haristylistcolortracker;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ThanksRegis extends AppCompatActivity {

    TextView a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanks_regis);

        a= (TextView) findViewById(R.id.my_text1);
        Typeface myCustomFont=Typeface.createFromAsset(getAssets(), "fonts/GreatVibes-Regular.ttf");
        a.setTypeface(myCustomFont);

    }
}
