package com.sujanth.cricketgame_scorekeeperapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int totalRunForA = 0;
    int totalRunForB = 0;
    int totalWicketForA = 0;
    int totalWicketForB = 0;

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

        //Team B Batsman Runs
        Button teamBOneRun = (Button) findViewById(R.id.team_b_one_run_button);
        Button teamBTwoRun = (Button) findViewById(R.id.team_b_two_run_button);
        Button teamBThreeRun = (Button) findViewById(R.id.team_b_three_run_button);
        Button teamBFourRun = (Button) findViewById(R.id.team_b_four_run_button);
        Button teamBSixRun = (Button) findViewById(R.id.team_b_six_run_button);

        //Team B Extra Runs
        Button teamBWides = (Button) findViewById(R.id.team_b_wide_run_button);
        Button teamBByes = (Button) findViewById(R.id.team_b_byes_run_button);
        Button teamBLegByes = (Button) findViewById(R.id.team_b_leg_byes_run_button);
        Button teamBNoBalls = (Button) findViewById(R.id.team_b_no_ball_run_button);

        //Team B wicket
        Button teamBWicket = (Button) findViewById(R.id.team_b_wicket_button);

        //Reset Score Button
        Button resetScores = (Button) findViewById(R.id.reset_score_button);

        //Game rules button
        Button gameRules = (Button) findViewById(R.id.game_rules_button);

        teamAOneRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int run = addRunsForA(1);
                displayTeamARun("" + run);
                displayCommentary("1 run for Team A, flighted outside off, brings out the reversey-percy again, swept through point for one");
            }
        });

        teamATwoRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int run = addRunsForA(2);
                displayTeamARun("" + run);
                displayCommentary("2 runs for Team A, driven ambitiously on the up, carved over cover point, in the air but no one's there - the batsman carnival of batting rumbles on!");
            }
        });

        teamAThreeRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int run = addRunsForA(3);
                displayTeamARun("" + run);
                displayCommentary("3 runs for Team A, full outside off, good response from Batsman as he gets forward and pushes firmly through the covers");
            }
        });

        teamAFourRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int run = addRunsForA(4);
                displayTeamARun("" + run);
                displayCommentary("FOUR, four more runs for Team A, a full toss from the bowler and batsman belts it away through midwicket");
            }
        });

        teamASixRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int run = addRunsForA(6);
                displayTeamARun("" + run);
                displayCommentary("SIX for Team A, full and on off, Batsman's times it to perfection as he lofts it with a straight bat over long-off.");
            }
        });

        teamAWides.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int run  = addRunsForA(1);
                displayTeamARun("" + run);
                displayCommentary("1 wide for Team A, first signs of swing , but too wide");
            }
        });

        teamANoBalls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int run = addRunsForA(1);
                displayTeamARun("" + run);
                displayCommentary("1 no ball for Team A, over steps for a no-ball! Batsman has another wild swing and a miss outside off.");
            }
        });

        teamALegByes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int run = addRunsForA(1);
                displayTeamARun("" + run);
                displayCommentary("1 leg bye for Team A, full on middle, pushed through flat, Batsman tries the big slog again and missed it. This looked plumb but the umpire is not interested. Boos from the crowd on the replay.");
            }
        });

        teamAByes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int run = addRunsForA(1);
                displayTeamARun("" + run);
                displayCommentary("1 bye for Team A, darted into leg stump, tries to sweep, misses and it goes off the fielder for a run");
            }
        });

        teamAWicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int wicket = lostTeamAWicket(1);
                displayTeamAWicket("" + wicket);
            }
        });

        //Team B functions
        teamBOneRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int run = addRunsForB(1);
                displayTeamBRun("" + run);
                displayCommentary("1 run for Team B, flighted outside off, brings out the reversey-percy again, swept through point for one");
            }
        });

        teamBTwoRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int run = addRunsForB(2);
                displayTeamBRun("" + run);
                displayCommentary("2 runs for Team B, driven ambitiously on the up, carved over cover point, in the air but no one's there - the batsman carnival of batting rumbles on!");
            }
        });

        teamBThreeRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int run = addRunsForB(3);
                displayTeamBRun("" + run);
                displayCommentary("3 runs for Team B, full outside off, good response from Batsman as he gets forward and pushes firmly through the covers");
            }
        });

        teamBFourRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int run = addRunsForB(4);
                displayTeamBRun("" + run);
                displayCommentary("FOUR, four more runs for Team B, a full toss from the bowler and batsman belts it away through midwicket");
            }
        });

        teamBSixRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int run = addRunsForB(6);
                displayTeamBRun("" + run);
                displayCommentary("SIX for Team B, full and on off, Batsman's times it to perfection as he lofts it with a straight bat over long-off.");
            }
        });

        teamBWides.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int run = addRunsForB(1);
                displayTeamBRun("" + run);
                displayCommentary("1 wide for Team B, first signs of swing , but too wide");
            }
        });

        teamBNoBalls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int run = addRunsForB(1);
                displayTeamBRun("" + run);
                displayCommentary("1 no ball for Team B, over steps for a no-ball! Batsman has another wild swing and a miss outside off.");
            }
        });

        teamBLegByes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int run = addRunsForB(1);
                displayTeamBRun("" + run);
                displayCommentary("1 leg bye for Team B, full on middle, pushed through flat, Batsman tries the big slog again and missed it. This looked plumb but the umpire is not interested. Boos from the crowd on the replay.");
            }
        });

        teamBByes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int run = addRunsForB(1);
                displayTeamBRun("" + run);
                displayCommentary("1 bye for Team B, darted into leg stump, tries to sweep, misses and it goes off the fielder for a run");
            }
        });

        teamBWicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int wicket = lostTeamBWicket(1);
                displayTeamBWicket("" + wicket);
            }
        });

        resetScores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalRunForA = 0;
                totalRunForB = 0;
                totalWicketForA = 0;
                totalWicketForB = 0;
                displayTeamARun("" + totalRunForA);
                displayTeamBRun("" + totalRunForB);
                displayCommentary("");
                displayTeamAWicket("" + totalWicketForA);
                displayTeamBWicket("" + totalWicketForB);
            }
        });

        gameRules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browseCricketRules = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.icc-cricket.com/cricket-rules-and-regulations"));
                startActivity(browseCricketRules);
            }
        });


    }


    public void displayTeamARun(String run) {
        TextView scores = (TextView) findViewById(R.id.team_a_scores_text_view);
        scores.setText(run);
    }

    public void displayTeamBRun(String run) {
        TextView scores = (TextView) findViewById(R.id.team_b_scores_text_view);
        scores.setText(run);
    }

    public void displayCommentary(String commentary) {
        TextView commentary_text = (TextView) findViewById(R.id.commentary_box_text_view);
        commentary_text.setText(commentary);
    }

    public void displayTeamAWicket(String wicket) {
        TextView wickets = (TextView) findViewById(R.id.team_a_wicket_display_text_view);
        wickets.setText(wicket);
    }

    public void displayTeamBWicket(String wicket) {
        TextView wickets = (TextView) findViewById(R.id.team_b_wicket_display_text_view);
        wickets.setText(wicket);
    }

    public int lostTeamAWicket(int wicket) {
        totalWicketForA = totalWicketForA + wicket;
        TextView commentary_text = (TextView) findViewById(R.id.commentary_box_text_view);
        commentary_text.setText("OUT, Doesn't clear long on this time! Head went again to another length ball, didn't nail it, Batsman got a good piece of it but it flew flat to the fielder on the rope and he takes a very good catch running along the rope");
        return totalWicketForA;
    }

    public int lostTeamBWicket(int wicket) {
        totalWicketForB = totalWicketForB + wicket;
        TextView commentary_text = (TextView) findViewById(R.id.commentary_box_text_view);
        commentary_text.setText("OUT, Doesn't clear long on this time! Head went again to another length ball, didn't nail it, Batsman got a good piece of it but it flew flat to the fielder on the rope and he takes a very good catch running along the rope");
        return totalWicketForB;
    }

    public int addRunsForA(int run) {
        totalRunForA = totalRunForA + run;
        return totalRunForA;
    }

    public int addRunsForB(int run) {
        totalRunForB = totalRunForB + run;
        return totalRunForB;
    }


}
