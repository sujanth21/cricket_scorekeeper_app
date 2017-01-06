package com.sujanth.cricketgame_scorekeeperapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int totalRun = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Team A Batsman runs
        Button teamAOneRun = (Button) findViewById(R.id.team_a_one_run_button);
        Button teamATwoRun = (Button) findViewById(R.id.team_a_two_run_button);
        Button teamAThreeRun = (Button) findViewById(R.id.team_a_three_run_button);
        Button teamAFourRun = (Button) findViewById(R.id.team_a_four_run_button);
        Button teamASixRun = (Button) findViewById(R.id.team_a_six_run_button);

        //Team A Extra runs
        Button teamAWides = (Button) findViewById(R.id.team_a_wide_run_button);
        Button teamAByes = (Button) findViewById(R.id.team_a_byes_run_button);
        Button teamALegByes = (Button) findViewById(R.id.team_a_leg_byes_run_button);
        Button teamANoBalls = (Button) findViewById(R.id.team_a_no_ball_run_button);

        //Team A Wicket
        Button teamAWicket = (Button) findViewById(R.id.team_a_wicket_button);

        teamAOneRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int run = addRuns(1);
                displayTeamARun("" + run);
                displayCommentary("1 run, flighted outside off, brings out the reversey-percy again, swept through point for one");
            }
        });

        teamATwoRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int run = addRuns(2);
                displayTeamARun("" + run);
                displayCommentary("2 runs, driven ambitiously on the up, carved over cover point, in the air but no one's there - the batsman carnival of batting rumbles on!");
            }
        });

        teamAThreeRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int run = addRuns(3);
                displayTeamARun("" + run);
                displayCommentary("3 runs, full outside off, good response from Batsman as he gets forward and pushes firmly through the covers");
            }
        });

        teamAFourRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int run = addRuns(4);
                displayTeamARun("" + run);
                displayCommentary("FOUR, four more, a full toss from the bowler and batsman belts it away through midwicket");
            }
        });

        teamASixRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int run = addRuns(6);
                displayTeamARun("" + run);
                displayCommentary("SIX, full and on off, Batsman's times it to perfection as he lofts it with a straight bat over long-off.");
            }
        });

        teamAWides.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int run  = addRuns(1);
                displayTeamARun("" + run);
                displayCommentary("1 wide, first signs of swing , but too wide");
            }
        });

        teamANoBalls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int run = addRuns(1);
                displayTeamARun("" + run);
                displayCommentary("1 no ball, over steps for a no-ball! Batsman has another wild swing and a miss outside off.");
            }
        });

        teamALegByes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int run = addRuns(1);
                displayTeamARun("" + run);
                displayCommentary("1 leg bye, full on middle, pushed through flat, Batsman tries the big slog again and missed it. This looked plumb but the umpire is not interested. Boos from the crowd on the replay.");
            }
        });

        teamAByes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int run = addRuns(1);
                displayTeamARun("" + run);
                displayCommentary("1 bye, darted into leg stump, tries to sweep, misses and it goes off the fielder for a run");
            }
        });

        teamAWicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lostTeamAWicket();
            }
        });


    }


    public void displayTeamARun(String run) {
        TextView scores = (TextView) findViewById(R.id.team_a_scores_text_view);
        scores.setText(run);
    }

    public void displayCommentary(String commentary) {
        TextView commentary_text = (TextView) findViewById(R.id.commentary_box_text_view);
        commentary_text.setText(commentary);
    }

    public void lostTeamAWicket() {
        TextView commentary_text = (TextView) findViewById(R.id.commentary_box_text_view);
        commentary_text.setText("OUT, Doesn't clear long on this time! Head went again to another length ball, didn't nail it, Batsman got a good piece of it but it flew flat to the fielder on the rope and he takes a very good catch running along the rope");
    }

    public int addRuns(int run) {
        totalRun = totalRun + run;
        return totalRun;
    }

}
