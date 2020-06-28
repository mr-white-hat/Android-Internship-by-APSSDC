package com.mrwhitehat.loginregistrationpages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button login, register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        login = findViewById(R.id.login);
        register = findViewById(R.id.register);



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usr = username.getText().toString();
                String pwd = password.getText().toString();

                if (!usr.equals("") && !pwd.equals("")) {
                    Intent home = new Intent(view.getContext(), welcome.class);
                    startActivity(home);
                }
                else {
                    Toast.makeText(MainActivity.this, "Please enter credentials!!", Toast.LENGTH_SHORT).show();
                }

            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reg = new Intent(MainActivity.this, register.class);
                startActivity(reg);
            }
        });

    }

}