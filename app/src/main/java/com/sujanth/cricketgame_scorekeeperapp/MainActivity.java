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

        //Batsman runs
        Button oneRun = (Button) findViewById(R.id.one_run_button);
        Button twoRun = (Button) findViewById(R.id.two_run_button);
        Button threeRun = (Button) findViewById(R.id.three_run_button);
        Button fourRun = (Button) findViewById(R.id.four_run_button);
        Button sixRun = (Button) findViewById(R.id.six_run_button);

        //Extra runs
        Button wides = (Button) findViewById(R.id.wide_run_button);
        Button byes = (Button) findViewById(R.id.byes_run_button);
        Button legByes = (Button) findViewById(R.id.leg_byes_run_button);
        Button noBalls = (Button) findViewById(R.id.no_ball_run_button);

        //Wicket
        Button wicket = (Button) findViewById(R.id.wicket_button);

        oneRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int run = addRuns(1);
                displayRun("" + run);
                displayCommentary("1 run, flighted outside off, brings out the reversey-percy again, swept through point for one");
            }
        });

        twoRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int run = addRuns(2);
                displayRun("" + run);
                displayCommentary("2 runs, driven ambitiously on the up, carved over cover point, in the air but no one's there - the batsman carnival of batting rumbles on!");
            }
        });

        threeRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int run = addRuns(3);
                displayRun("" + run);
                displayCommentary("3 runs, full outside off, good response from Batsman as he gets forward and pushes firmly through the covers");
            }
        });

        fourRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int run = addRuns(4);
                displayRun("" + run);
                displayCommentary("FOUR, four more, a full toss from the bowler and batsman belts it away through midwicket");
            }
        });

        sixRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int run = addRuns(6);
                displayRun("" + run);
                displayCommentary("SIX, full and on off, Batsman's times it to perfection as he lofts it with a straight bat over long-off.");
            }
        });

        wides.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int run  = addRuns(1);
                displayRun("" + run);
                displayCommentary("1 wide, first signs of swing , but too wide");
            }
        });

        noBalls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int run = addRuns(1);
                displayRun("" + run);
                displayCommentary("1 no ball, over steps for a no-ball! Batsman has another wild swing and a miss outside off.");
            }
        });

        legByes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int run = addRuns(1);
                displayRun("" + run);
                displayCommentary("1 leg bye, full on middle, pushed through flat, Batsman tries the big slog again and missed it. This looked plumb but the umpire is not interested. Boos from the crowd on the replay.");
            }
        });

        byes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int run = addRuns(1);
                displayRun("" + run);
                displayCommentary("1 bye, darted into leg stump, tries to sweep, misses and it goes off the fielder for a run");
            }
        });

        wicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lostWicket();
            }
        });


    }


    public void displayRun(String run) {
        TextView scores = (TextView) findViewById(R.id.scores_text_view);
        scores.setText(run);
    }

    public void displayCommentary(String commentary) {
        TextView commentary_text = (TextView) findViewById(R.id.commentary_box_text_view);
        commentary_text.setText(commentary);
    }

    public void lostWicket() {
        TextView commentary_text = (TextView) findViewById(R.id.commentary_box_text_view);
        commentary_text.setText("OUT, Doesn't clear long on this time! Head went again to another length ball, didn't nail it, Batsman got a good piece of it but it flew flat to the fielder on the rope and he takes a very good catch running along the rope");
    }

    public int addRuns(int run) {
        totalRun = totalRun + run;
        return totalRun;
    }

}
