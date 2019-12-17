package com.andy.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.image_down).setOnClickListener(this);
        findViewById(R.id.image_left).setOnClickListener(this);
        findViewById(R.id.image_right).setOnClickListener(this);
        findViewById(R.id.image_up).setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.image_up:
            Log.d("Main","up");
            break;

            case R.id.image_down:
                Log.d("Main","down");
                break;

            case R.id.image_left:
                Log.d("Main","left");
                break;

            case R.id.image_right:
                Log.d("Main","right");
                break;
        }
    }

}
