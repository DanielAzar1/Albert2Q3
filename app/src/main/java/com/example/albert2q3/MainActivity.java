package com.example.albert2q3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
    }

    public void lol(View view) {
        counter++;
        if (counter == 6)
        {
            counter = 0;
            btn.setText("Enough to click. Go to new start!");
        }
        else btn.setText("This is click number "+counter);
    }
}