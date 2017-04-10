package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreForA = 0;
    int scoreForB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreForA);
        displayForTeamB(scoreForB);
    }

    /**
     * Displays the given score for Team A.
     */
    private void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.c
     */
    private void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreePointsForTeamA (View v){
        scoreForA = scoreForA + 3;
        displayForTeamA(scoreForA);
    }

    public void addTwoPointsForTeamA (View v){
        scoreForA = scoreForA + 2;
        displayForTeamA(scoreForA);
    }

    public void addOnePointForTeamA (View v){
        scoreForA = scoreForA + 1;
        displayForTeamA(scoreForA);
    }

    public void addThreePointsForTeamB (View v){
        scoreForB = scoreForB + 3;
        displayForTeamB(scoreForB);
    }

    public void addTwoPointsForTeamB (View v){
        scoreForB = scoreForB + 2;
        displayForTeamB(scoreForB);
    }

    public void addOnePointForTeamB (View v){
        scoreForB = scoreForB + 1;
        displayForTeamB(scoreForB);
    }

    public void reset(View v){
        scoreForA = 0;
        scoreForB = 0;
        displayForTeamA(scoreForA);
        displayForTeamB(scoreForB);
    }
}
