package com.mrwhitehat.loginregistrationpages;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class register extends AppCompatActivity {

    EditText username, password, mail, phone;
    Button register, login;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        mail = (EditText) findViewById(R.id.mail);
        phone = (EditText) findViewById(R.id.phone);
        register = findViewById(R.id.register);
        login = findViewById(R.id.login);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usr = username.getText().toString();
                String pwd = password.getText().toString();
                String email = mail.getText().toString();
                String num = phone.getText().toString();

                if (!usr.equals("") && !pwd.equals("") && !email.equals("") && !num.equals("")) {
                    Intent home = new Intent(view.getContext(), welcome.class);
                    startActivity(home);
                }
                else {
                    Toast.makeText(register.this, "Please enter credentials!!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent log = new Intent(view.getContext(), MainActivity.class);
                startActivity(log);
            }
        });

    }
}
