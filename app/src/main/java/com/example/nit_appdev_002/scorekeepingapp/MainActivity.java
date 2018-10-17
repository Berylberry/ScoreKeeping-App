package com.example.nit_appdev_002.scorekeepingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //declare static variables
    private static int teamAScore = 0;
    private static int teamAFoul = 0;
    private static int teamBScore = 0;
    private static int teamBFoul = 0;

    private TextView teamAScoreText;
    private TextView teamAFoulText;
    private TextView teamBScoreText;
    private TextView teamBFoulText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teamAScoreText = findViewById(R.id.team_a_score);
        teamAFoulText = findViewById(R.id.team_a_foul);
        teamBScoreText = findViewById(R.id.team_b_score);
        teamBFoulText = findViewById(R.id.team_b_foul);


    }

    public void incrementTeamAFoul(View view){
        teamAFoul++;
        teamAFoulText.setText(String.valueOf(teamAFoul));
    }

    public void incrementTeamAScore(View view){
        teamAScore++;
        teamAScoreText.setText(String.valueOf(teamAScore));
    }

    public void incrementTeamBFoul(View view){
        teamBFoul++;
        teamBFoulText.setText(String.valueOf(teamBFoul));
    }

    public void incrementTeamBScore(View view){
        teamBScore++;
        teamBScoreText.setText(String.valueOf(teamBScore));
    }

    public void reset(View view){
        teamAScore = 0;
        teamAScoreText.setText(String.valueOf(teamAScore));
        teamAFoul = 0;
        teamAFoulText.setText(String.valueOf(teamAFoul));
        teamBScore = 0;
        teamBScoreText.setText(String.valueOf(teamBScore));
        teamBFoul = 0;
        teamBFoulText.setText(String.valueOf(teamBFoul));
    }
}
