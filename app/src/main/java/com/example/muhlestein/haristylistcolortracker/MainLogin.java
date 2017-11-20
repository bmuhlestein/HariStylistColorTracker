package com.example.muhlestein.haristylistcolortracker;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainLogin extends AppCompatActivity {

    TextView t;
    Button new_user_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);
        new_user_btn = (Button) findViewById(R.id.new_user_btn);

        t= (TextView) findViewById(R.id.my_text);
        Typeface myCustomFont=Typeface.createFromAsset(getAssets(), "fonts/PinkClouds.ttf");
        t.setTypeface(myCustomFont);

        public void onClick(View v){
            switch(v.getId()){
                case R.id.new_user_btn:
                    Intent newUser = new Intent(MainLogin.this, newUser.class);
                    startActivity(newUser);
                    break;
            }
        }

    }
}
