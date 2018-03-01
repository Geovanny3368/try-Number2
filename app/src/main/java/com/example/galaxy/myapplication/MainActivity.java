package com.example.galaxy.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    //This is new to me. I am messing with git and github through cmd.
    //The second push to the server is now using an ssh key
    //The push with the ssh key did not work because the path was configured with Htts://
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
