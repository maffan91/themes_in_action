package com.app.maffan.themeinaction;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    Button redButton;
    Button greedButton;
    Button blueButton;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        redButton = (Button) findViewById(R.id.red_button);
        greedButton = (Button) findViewById(R.id.green_button);
        blueButton = (Button) findViewById(R.id.blue_button);



    }

    public void onRedClick(View view){

        intent = new Intent(MainActivity.this,RedActivity.class);
        startActivity(intent);
    }

    public void onGreenClick(View view){

        intent = new Intent(MainActivity.this,GreenActivity.class);
        startActivity(intent);
    }

    public void onBlueClick(View view){

        intent = new Intent(MainActivity.this,BlueActivity.class);
        startActivity(intent);
    }

}
