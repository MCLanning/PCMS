package com.example.mike.seekbar;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

import com.example.mike.Main.listeningScreen;


public class MainActivity extends AppCompatActivity implements OnSeekBarChangeListener{
    private SeekBar seekBar;
    private TextView textView;
    private int progress = 0;
    public final static String EXTRA_MESSAGE = "com.example.seekbar.MESSAGE";
    private Model model;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeVariables();
        model = new Model();

        // Initialize the textview with '0'.
        textView.setText("Activity Level: " + 20*(seekBar.getProgress()) + "%");

        seekBar.setOnSeekBarChangeListener(this);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progressValue, boolean fromUser) {
        progress = progressValue; //position of sliderbar
        textView.setText("Activity Level: " + 20*(seekBar.getProgress()) + "%");//slider bar progress displayed in 20 percent steps

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
    }


    // A private method to help us initialize our variables.
    private void initializeVariables() {
        seekBar = (SeekBar) findViewById(R.id.seekBar1);
        textView = (TextView) findViewById(R.id.textView1);
    }

    /** Called when the user clicks the Send Button */
    public void sendMessage(View view){
        Intent Info = new Intent(this, InfoScreen.class);
        startActivity(Info);
        //respond to button
    }
    public void acceptMessage (View view){
        Intent Accept = new Intent(this, listeningScreen.class);
        startActivity(Accept);
        //respond to button
    }

}
