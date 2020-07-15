package com.mrwhitehat.registration_form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText roll, name, phone, email, pass;

    Spinner gender, branch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        roll = (EditText) findViewById(R.id.roll);
        name = (EditText) findViewById(R.id.name);
        phone = (EditText) findViewById(R.id.phone);
        email = (EditText) findViewById(R.id.email);
        pass = (EditText) findViewById(R.id.pass);

        gender = (Spinner) findViewById(R.id.gender);
        branch = (Spinner) findViewById(R.id.branch);

    }

    public void submit_form(View view) {

        String roll_s = roll.getText().toString();
        String name_s = name.getText().toString();
        String phone_s = phone.getText().toString();
        String email_s = email.getText().toString();
        String pass_s = pass.getText().toString();

        String gender_s = gender.getSelectedItem().toString();
        String branch_s = branch.getSelectedItem().toString();

        if (!roll_s.isEmpty() && !name_s.isEmpty() && !phone_s.isEmpty() && !email_s.isEmpty() && !pass_s.isEmpty() && !gender_s.isEmpty() && !branch_s.isEmpty()) {
            Intent intent = new Intent(this, User_details.class);
            intent.putExtra("Roll", roll_s);
            intent.putExtra("Name", name_s);
            intent.putExtra("Phone", phone_s);
            intent.putExtra("Email", email_s);
            intent.putExtra("Pass", pass_s);
            intent.putExtra("GendeR", gender_s);
            intent.putExtra("BrancH", branch_s);
            startActivity(intent);
        }
        else {
            Toast.makeText(this, "One or more * credentials are empty!!!", Toast.LENGTH_SHORT).show();
        }

    }
}