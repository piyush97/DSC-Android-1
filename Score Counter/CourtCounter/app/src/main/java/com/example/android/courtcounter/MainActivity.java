package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       int var2 = 0;
       int var1 = 0;
        displayForTeamA(var1);
        displayForTeamB(var2);
    }

    int team_a_score = 0;
    int team_b_score = 0;

    public void reset(View view){
        team_a_score = 0;
        team_b_score = 0;
        displayForTeamA(team_a_score);
        displayForTeamB(team_b_score);
    }
    public void Point3A(View view) {
        team_a_score = team_a_score + 3;
        displayForTeamA(team_a_score);
    }

    public void Point2A(View view) {
        team_a_score = team_a_score + 2;
        displayForTeamA(team_a_score);
    }

    public void Point1A(View view) {
        team_a_score = team_a_score + 1;
        displayForTeamA(team_a_score);
    }

    public void Point3B(View view) {
        team_b_score = team_b_score + 3;
        displayForTeamB(team_b_score);
    }

    public void Point2B(View view) {
        team_b_score = team_b_score + 2;
        displayForTeamB(team_b_score);
    }

    public void Point1B(View view) {
        team_b_score = team_b_score + 1;
        displayForTeamB(team_b_score);
    }

    /**
     * displayForTeamAs the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(""+score);
    }
}
