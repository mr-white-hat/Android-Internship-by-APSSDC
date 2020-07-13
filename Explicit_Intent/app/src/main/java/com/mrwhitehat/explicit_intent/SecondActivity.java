package com.mrwhitehat.explicit_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.mrwhitehat.explicit_intent.MainActivity.EXTRA_MESSAGE;

public class SecondActivity extends AppCompatActivity {

    private EditText msg;
    Button reply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        msg = findViewById(R.id.msg);
        reply = findViewById(R.id.reply);

        Intent intent = getIntent();
        String message = intent.getStringExtra(EXTRA_MESSAGE);
        TextView display = findViewById(R.id.display);
        display.setText(message);

    }

    public void launch_main_activity(View view) {
        Intent intent2 = new Intent(this, MainActivity.class);
        String message = msg.getText().toString();
        intent2.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent2);
    }
}