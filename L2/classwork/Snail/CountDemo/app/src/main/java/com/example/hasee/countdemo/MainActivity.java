package com.example.hasee.countdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mTeamA;
    private TextView mTeamB;
    private int TeamAPoint;
    private int TeamBPoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTeamA = (TextView) findViewById(R.id.tvTeamA);
        mTeamB = (TextView) findViewById(R.id.tvTeamB);
        findViewById(R.id.btnTeamA).setOnClickListener(this);
        findViewById(R.id.btnTeamA2).setOnClickListener(this);
        findViewById(R.id.btnTeamA3).setOnClickListener(this);
        findViewById(R.id.btnTeamB).setOnClickListener(this);
        findViewById(R.id.btnTeamB2).setOnClickListener(this);
        findViewById(R.id.btnTeamB3).setOnClickListener(this);
        findViewById(R.id.button).setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnTeamA:
                TeamAPoint = 0;
                mTeamA.setText(String.valueOf(TeamAPoint));
                break;
            case R.id.btnTeamA2:
                TeamAPoint += 2;
                mTeamA.setText(String.valueOf(TeamAPoint));
                break;
            case R.id.btnTeamA3:
                TeamAPoint += 3;
                mTeamA.setText(String.valueOf(TeamAPoint));
                break;
            case R.id.btnTeamB:
                TeamBPoint = 0;
                mTeamB.setText(String.valueOf(TeamBPoint));
                break;
            case R.id.btnTeamB2:
                TeamBPoint += 2;
                mTeamB.setText(String.valueOf(TeamBPoint));
                break;
            case R.id.btnTeamB3:
                TeamBPoint += 3;
                mTeamB.setText(String.valueOf(TeamBPoint));
                break;
            case R.id.button:
                TeamAPoint = 0;
                mTeamA.setText(String.valueOf(TeamAPoint));
                TeamBPoint = 0;
                mTeamB.setText(String.valueOf(TeamBPoint));
                break;
        }
    }
}
