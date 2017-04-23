package com.gzr7702.hockeyscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Integer mHomeScore = 0;
    Integer mAwayScore = 0;
    Integer mHomePenalties = 0;
    Integer mAwayPenalties = 0;
    TextView mScoreTextHome;
    TextView mScoreTextAway;
    TextView mPenaltyTextHome;
    TextView mPenaltyTextAway;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set up all the view vars
        setContentView(R.layout.activity_main);

        final Button homeScoreButton = (Button) findViewById(R.id.team1_score_button);
        final Button awayScoreButton = (Button) findViewById(R.id.team2_score_button);
        final Button homePenaltyButton = (Button) findViewById(R.id.team1_penalty_button);
        final Button awayPenaltyButton = (Button) findViewById(R.id.team2_penalty_button);
        final Button resetButton = (Button) findViewById(R.id.reset_button);

        mScoreTextHome = (TextView) findViewById(R.id.team1_score_text);
        mScoreTextAway = (TextView) findViewById(R.id.team2_score_text);
        mPenaltyTextHome = (TextView) findViewById(R.id.team1_penalties_text);
        mPenaltyTextAway = (TextView) findViewById(R.id.team2_penalties_text);

        // initialize all text fields
        mScoreTextHome.setText(mHomeScore.toString());
        mScoreTextAway.setText(mAwayScore.toString());
        mPenaltyTextHome.setText(mAwayPenalties.toString());
        mPenaltyTextAway.setText(mHomePenalties.toString());
    }

    public void updateHomeScore(View v) {
        mHomeScore++;
        mScoreTextHome.setText(mHomeScore.toString());
    }

    public void updateAwayScore(View v) {
        mAwayScore++;
        mScoreTextAway.setText(mAwayScore.toString());
    }

    public void updateHomePenalty(View v) {
        mHomePenalties++;
        mPenaltyTextHome.setText(mHomePenalties.toString());
    }

    public void updateAwayPenalty(View v) {
        mAwayPenalties++;
        mPenaltyTextAway.setText(mAwayPenalties.toString());
    }

    public void reset(View v) {
        // Set all scores to 0;
        mHomeScore = 0;
        mAwayScore = 0;
        mHomePenalties = 0;
        mAwayPenalties = 0;

        // reinitialize all text fields
        mScoreTextHome.setText(mHomeScore.toString());
        mScoreTextAway.setText(mAwayScore.toString());
        mPenaltyTextHome.setText(mAwayPenalties.toString());
        mPenaltyTextAway.setText(mHomePenalties.toString());
    }

}
