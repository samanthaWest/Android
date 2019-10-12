package com.example.tallycounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Declare at class level
    private TextView countTextView;
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Tally Count
        count = 0;

        Button countButton = findViewById(R.id.countButton);
        Button resetButton = findViewById(R.id.resetButton);

        // Init upon app creation
        countTextView = findViewById(R.id.countTextView);

        countButton.setOnClickListener(onClickCountButton);
        resetButton.setOnClickListener(onClickResetButton);
    }

    private View.OnClickListener onClickCountButton = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            count++;
            countTextView.setText(String.valueOf(count));
        }
    };

    private View.OnClickListener onClickResetButton = new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            count = 0;
            countTextView.setText(String.valueOf(count));
        }
    };
}
