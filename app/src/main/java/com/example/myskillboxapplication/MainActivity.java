package com.example.myskillboxapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "!@#";
    Button btnOne;
    Button btnTwo;
    Button btnThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOne = findViewById(R.id.button_1);
        btnTwo = findViewById(R.id.button_2);
        btnThree = findViewById(R.id.button_3);
        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (btnOne.equals(view)) {
            Log.d(TAG, "onClick: button 1");
        } else if (btnTwo.equals(view)) {
            Log.d(TAG, "onClick: button 2");
        } else if (btnThree.equals(view)) {
            Log.d(TAG, "onClick: button 3");
        }
    }
}