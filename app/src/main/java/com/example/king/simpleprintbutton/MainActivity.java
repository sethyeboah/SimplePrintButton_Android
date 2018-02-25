package com.example.king.simpleprintbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Make a button print a toast welcome message
        Button touchMeButton = findViewById(R.id.touchMeButton);

        touchMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView welcomeText = findViewById(R.id.welcomeText);

                //Print welcome message using setText
                welcomeText.setText("Welcome to Android Development!");

                //Print welcome message using Toast
                Toast.makeText(getApplicationContext(),"Welcome to Android Development!", Toast.LENGTH_SHORT)
                        .show();
            }
        });


    }
}
