package com.example.muhlestein.haristylistcolortracker;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class newUser extends MainLogin {

    EditText new_user_first_name_edit;
    EditText new_user_last_name_edit;
    EditText new_user_phone_edit;
    EditText new_user_username_edit;
    EditText new_user_password_edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user);

        Intent intent = getIntent();

        new_user_first_name_edit = (EditText) findViewById(R.id.new_user_first_name_edit);
        new_user_last_name_edit = (EditText) findViewById(R.id.new_user_last_name_edit);
        new_user_phone_edit = (EditText) findViewById(R.id.new_user_phone_edit);
        new_user_username_edit = (EditText) findViewById(R.id.new_user_username_edit);
        new_user_password_edit = (EditText) findViewById(R.id.new_user_password_edit);

        Button new_user_submit_btn = (Button) findViewById(R.id.new_user_submit_btn);
        Button new_user_cancel_btn = (Button) findViewById(R.id.new_user_cancel_btn);

        new_user_submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thanks = new Intent(newUser.this, ThanksRegis.class);
                startActivity(thanks);
            }
        });
    }
}
