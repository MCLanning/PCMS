package com.example.mike.Main;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.mike.seekbar.MainActivity;
import com.example.mike.seekbar.R;

public class listeningScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listening_screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Your motion exceeds the submitted constraints", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    //
    //  The following code is for the data validation and handling of the received data
    //  It still needs to output either Toast notification or a more prominent pop-up
    //

    /* protected void onAcceptButton(View view){

        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.Accept);

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                boolean dataIn = true;//app is receiving data
                float seekBarProgress = seekBar.getProgress();//get constraint proportion
                float Constraint = -1;

                while (Constraint == -1) {
                    //possible error message
                    //could also just continue and find the seekBar progress, then assign a new constraint

                    if (seekBarProgress == 0) {
                        //set constraint to be correct level
                        Constraint = 5;
                    }
                    else if (seekBarProgress == 1) {
                        //set constraint to be correct level
                        Constraint = 5;
                    }
                    else if (seekBarProgress == 2) {
                        //set constraint to be correct level
                        Constraint = 5;
                    }
                    else if (seekBarProgress == 3) {
                        //set constraint to be correct level
                        Constraint = 5;
                    }
                    else if (seekBarProgress == 4) {
                        //set constraint to be correct level
                        Constraint = 5;
                    }
                    else if (seekBarProgress == 5) {
                        //set constraint to be correct level
                        Constraint = 5;
                    }

                }
                float valueInTest = 0;//constantly refresh with new incoming data


                while (dataIn = true){
                    if (valueInTest >= Constraint)
                    {
                        boolean exceed = true;//go to toast widget to poke user
                    }
                }
            }
        });
    }
*/

    public void rejectMessage(View view){
        Intent Main = new Intent(this, MainActivity.class);
        startActivity(Main);
        // respond to back button
    }

}
