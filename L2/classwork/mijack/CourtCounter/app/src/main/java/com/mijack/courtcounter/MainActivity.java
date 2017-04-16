package com.mijack.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnReset;
    TextView teamA;
    TextView teamAPoint;
    Button addA3Point;
    Button addA2Point;
    Button aFreeThrow;
    TextView teamB;
    TextView teamBPoint;
    Button addB3Point;
    Button addB2Point;
    Button bFreeThrow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnReset = (Button) findViewById(R.id.btnReset);
        teamA = (TextView) findViewById(R.id.teamA);
        teamAPoint = (TextView) findViewById(R.id.teamAPoint);
        addA3Point = (Button) findViewById(R.id.addA3Point);
        addA2Point = (Button) findViewById(R.id.addA2Point);
        aFreeThrow = (Button) findViewById(R.id.aFreeThrow);
        teamB = (TextView) findViewById(R.id.teamB);
        teamBPoint = (TextView) findViewById(R.id.teamBPoint);
        addB3Point = (Button) findViewById(R.id.addB3Point);
        addB2Point = (Button) findViewById(R.id.addB2Point);
        bFreeThrow = (Button) findViewById(R.id.bFreeThrow);

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamAPoint.setText(String.valueOf(0));
                teamBPoint.setText(String.valueOf(0));
            }
        });

        bindView(addA2Point, 2, teamAPoint);
        bindView(addA3Point, 3, teamAPoint);
        bindView(aFreeThrow, 1, teamAPoint);

        bindView(addB2Point, 2, teamBPoint);
        bindView(addB3Point, 3, teamBPoint);
        bindView(bFreeThrow, 1, teamBPoint);

    }

    private void bindView(Button btn, int number, TextView point) {
        btn.setOnClickListener(new PointAdder(point, number));
    }

    public static class PointAdder implements View.OnClickListener {
        private TextView point;
        private Integer number;

        public PointAdder(TextView point, Integer number) {
            this.point = point;
            this.number = number;
        }

        @Override
        public void onClick(View v) {
            String s = point.getText().toString();
            Integer integer = Integer.valueOf(s);
            point.setText(String.valueOf(integer + number));
        }
    }
}

