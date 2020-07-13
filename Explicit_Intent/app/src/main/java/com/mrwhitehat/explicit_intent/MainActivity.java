package com.mrwhitehat.explicit_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText text;
    Button send;
    TextView header1;
    TextView display1;

    public static final String EXTRA_MESSAGE = "null";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text);
        send = findViewById(R.id.send);
        header1 = findViewById(R.id.header1);
        display1 = findViewById(R.id.display1);

        header1.setVisibility(View.INVISIBLE);
        display1.setVisibility(View.INVISIBLE);

        Intent intent2 = getIntent();
        String message = intent2.getStringExtra(EXTRA_MESSAGE);
        if (message != null) {
            header1.setVisibility(View.VISIBLE);
            display1.setVisibility(View.VISIBLE);
            display1.setText(message);
        }
    }

    public void launch_next_activity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String message = text.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}