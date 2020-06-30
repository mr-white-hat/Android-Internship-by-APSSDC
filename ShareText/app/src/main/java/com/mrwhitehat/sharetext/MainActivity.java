package com.mrwhitehat.sharetext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText texts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texts = findViewById(R.id.texts);
    }

    public void sharetext(View view) {
        String Txt = texts.getText().toString();
        Intent txt = new Intent(Intent.ACTION_SEND);
        txt.putExtra(Intent.EXTRA_TEXT, Txt);
        txt.setType("text/plain");
        startActivity(Intent.createChooser(txt, "Share to"));
    }
}