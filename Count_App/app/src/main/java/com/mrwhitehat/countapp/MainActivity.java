package com.mrwhitehat.countapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.service.autofill.OnClickAction;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Context;

public class MainActivity extends AppCompatActivity {

    TextView TV;
    Button countInc, countDec, zero, toast;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TV = findViewById(R.id.TV);
        countInc = findViewById(R.id.countInc);
        countDec = findViewById(R.id.countDec);
        zero = findViewById(R.id.zero);
        toast = findViewById(R.id.toast);

        countInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                TV.setText(""+count);
            }
        });
        countDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count--;
                TV.setText(""+count);
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count =0;
                TV.setText("0");
            }
        });
        if (savedInstanceState != null) {
            String counter = savedInstanceState.getString("s_count");
            count = Integer.parseInt(counter);
            TV.setText("" + count);
        }
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("s_count", TV.getText().toString());

    }

    public void display(View view) {
        Toast.makeText(this, "Your Count is: " + count, Toast.LENGTH_SHORT).show();
    }
}