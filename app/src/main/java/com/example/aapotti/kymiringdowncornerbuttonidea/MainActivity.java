package com.example.aapotti.kymiringdowncornerbuttonidea;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button menuButton;
    LinearLayout menuLinearLayout;

    TextView info;
    TextView events;
    TextView tickets;
    TextView map;
    TextView motogp;
    TextView formula1;
    TextView accommodation;
    TextView activities;
    TextView arrival;
    TextView experiences;

    boolean menuReadyToOpen;
    boolean menuReadyToClose;

    public void openMenu(View view)
    {
        if(menuReadyToOpen)
        {
            menuReadyToOpen = false;
            menuButton.animate().rotation(-180).setDuration(300);
            menuButton.animate().translationXBy(-500f).setDuration(300);
            menuLinearLayout.animate().translationXBy(-1500f).setDuration(300);

            //Text views animations

            info.animate().translationXBy(-100).setDuration(260);
            events.animate().translationXBy(-200).setDuration(280);
            tickets.animate().translationXBy(-300).setDuration(300);
            map.animate().translationXBy(-400).setDuration(320);
            motogp.animate().translationXBy(-500).setDuration(340);
            formula1.animate().translationXBy(-600).setDuration(360);
            accommodation.animate().translationXBy(-700).setDuration(380);
            activities.animate().translationXBy(-800).setDuration(400);
            arrival.animate().translationXBy(-900).setDuration(420);
            experiences.animate().translationXBy(-1000).setDuration(440);

            new CountDownTimer(440, 100)
            {
                @Override
                public void onTick(long millisUntilFinished)
                {

                }

                @Override
                public void onFinish()
                {
                    menuReadyToClose = true;
                }
            }.start();
        }
        else if(menuReadyToClose)
        {
            menuReadyToClose = false;
            menuButton.animate().rotation(180).setDuration(300);
            menuButton.animate().translationXBy(500f).setDuration(300);
            menuLinearLayout.animate().translationXBy(1500f).setDuration(500);

            new CountDownTimer(500, 100)
            {
                @Override
                public void onTick(long millisUntilFinished)
                {

                }

                @Override
                public void onFinish()
                {
                    info.setTranslationX(100);
                    events.setTranslationX(200);
                    tickets.setTranslationX(300);
                    map.setTranslationX(400);
                    motogp.setTranslationX(500);
                    formula1.setTranslationX(600);
                    accommodation.setTranslationX(700);
                    activities.setTranslationX(800);
                    arrival.setTranslationX(900);
                    experiences.setTranslationX(1000);

                    menuReadyToOpen = true;
                }
            }.start();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuButton = (Button)findViewById(R.id.menuButton);

        menuLinearLayout = (LinearLayout)findViewById(R.id.menuLinearLayout);
        menuLinearLayout.setTranslationX(1500f);

        //Menu text views starting positions

        info = (TextView)findViewById(R.id.info);
        info.setTranslationX(100);

        events = (TextView)findViewById(R.id.events);
        events.setTranslationX(200);

        tickets = (TextView)findViewById(R.id.tickets);
        tickets.setTranslationX(300);

        map = (TextView)findViewById(R.id.map);
        map.setTranslationX(400);

        motogp = (TextView)findViewById(R.id.motogp);
        motogp.setTranslationX(500);

        formula1 = (TextView)findViewById(R.id.formula1);
        formula1.setTranslationX(600);

        accommodation = (TextView)findViewById(R.id.accomodation);
        accommodation.setTranslationX(700);

        activities = (TextView)findViewById(R.id.activities);
        activities.setTranslationX(800);

        arrival = (TextView)findViewById(R.id.arrival);
        arrival.setTranslationX(900);

        experiences = (TextView)findViewById(R.id.experiences);
        experiences.setTranslationX(1000);

        //Starting menu state

        menuReadyToOpen = true;
        menuReadyToClose = false;
    }
}
