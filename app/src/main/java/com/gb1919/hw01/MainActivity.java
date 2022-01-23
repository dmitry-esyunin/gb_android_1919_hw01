package com.gb1919.hw01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        switch_layouts(R.layout.activity_main, R.layout.activity_second);
    }

    private void switch_layouts(int layout,int next_layout){
        setContentView(layout);
        Button button = findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(next_layout);
                switch_layouts(next_layout, layout);
            }
        });
    }



}