package com.mrwhitehat.registration_form;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class User_details extends AppCompatActivity {

    TextView roll, name, phone, email, pass, gender, branch;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_details);

        roll = (TextView) findViewById(R.id.roll);
        name = (TextView) findViewById(R.id.name);
        phone = (TextView) findViewById(R.id.phone);
        email = (TextView) findViewById(R.id.email);
        pass = (TextView) findViewById(R.id.pass);
        gender = (TextView) findViewById(R.id.gender);
        branch = (TextView) findViewById(R.id.branch);

        Intent intent = getIntent();
        roll.setText("Roll No.: " + intent.getStringExtra("Roll"));
        name.setText("Name: " + intent.getStringExtra("Name"));
        phone.setText("Phone: " + intent.getStringExtra("Phone"));
        email.setText("Email: " + intent.getStringExtra("Email"));
        pass.setText("Pass: " + intent.getStringExtra("Pass"));
        gender.setText("Gender: " + intent.getStringExtra("GendeR"));
        branch.setText("Branch: " + intent.getStringExtra("BrancH"));

    }
}
