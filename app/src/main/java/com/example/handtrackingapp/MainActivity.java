package com.example.handtrackingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log; //for logging console

import android.widget.Button;
import android.widget.ListView;

import static android.R.attr.id;

// Jim's comment
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Button btnPaired;
    ListView deviceList;

    btnPaired.findViewById(id.buttonOn);


//messing with output to console NOTE::doesnt work yet
    //Log.v(CONSOLE_TAG, "Testing Console...\n");
}
