package com.mrwhitehat.scoreboardapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView scoreA, scoreB;
    Button plus1A, plus2A, plus3A, plus1B, plus2B, plus3B, reset;
    int teamA, teamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreA = findViewById(R.id.scoreA);
        scoreB = findViewById(R.id.scoreB);
        plus1A = findViewById(R.id.plus1A);
        plus2A = findViewById(R.id.plus2A);
        plus3A = findViewById(R.id.plus3A);
        plus1B = findViewById(R.id.plus1B);
        plus2B = findViewById(R.id.plus2B);
        plus3B = findViewById(R.id.plus3B);
        reset = findViewById(R.id.reset);

        plus1A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamA++;
                scoreA.setText("" + teamA);
            }
        });

        plus2A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamA += 2;
                scoreA.setText("" + teamA);
            }
        });

        plus3A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamA += 3;
                scoreA.setText("" + teamA);
            }
        });

        plus1B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamB++;
                scoreB.setText("" + teamB);
            }
        });

        plus2B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamB += 2;
                scoreB.setText("" + teamB);
            }
        });

        plus3B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamB += 3;
                scoreB.setText("" + teamB);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamA = 0;
                teamB = 0;
                scoreA.setText("" + teamA);
                scoreB.setText("" + teamB);
            }
        });

        if (savedInstanceState != null) {
            String Team_A = savedInstanceState.getString("TeamA");
            String Team_B = savedInstanceState.getString("TeamB");

            teamA = Integer.parseInt(Team_A);
            teamB = Integer.parseInt(Team_B);

            scoreA.setText("" + teamA);
            scoreB.setText("" + teamB);
        }

    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("TeamA", scoreA.getText().toString());
        outState.putString("TeamB", scoreB.getText().toString());
    }
}