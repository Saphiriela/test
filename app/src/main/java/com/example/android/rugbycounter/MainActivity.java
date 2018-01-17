package com.example.android.rugbycounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.android.rugbycounter.R;

public class MainActivity extends AppCompatActivity {
    // Tracks the score for Team A
    int scoreTeamA = 0;

    // Tracks the score for Team B
    int scoreTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById( R.id.team_a_score );
        scoreView.setText( String.valueOf( score ) );
    }

    /**
     * Increase the score for Team A by 5 point.
     */
    public void addFiveForTeamA(View v) {
        scoreTeamA = scoreTeamA + 5;
        displayForTeamA( scoreTeamA );
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA( scoreTeamA );
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA( scoreTeamA );
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById( R.id.team_b_score );
        scoreView.setText( String.valueOf( score ) );
    }

    /**
     * Increase the score for Team B by 5 point.
     */
    public void addFiveForTeamB(View v) {
        scoreTeamB = scoreTeamB + 5;
        displayForTeamB( scoreTeamB );
    }

    /**
     * Increase the score for Team B by 3 points.
     */
    public void addThreeForTeamB(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB( scoreTeamB );
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    public void addTwoForTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB( scoreTeamB );
    }


    /**
     * Resets the score for both Teams to 0 points.
     */
    public void resetTeamScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA( scoreTeamA );
        displayForTeamB( scoreTeamB );
    }

}