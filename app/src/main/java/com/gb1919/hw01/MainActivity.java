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
        int[] layouts = {R.layout.activity_main, R.layout.activity_second, R.layout.activity_another};
        switch_layouts(layouts, 0);
    }

    private void switch_layouts(int[] layouts, int index){
        int index_next = (index + 1) % layouts.length;
        setContentView(layouts[index]);
        Button button = findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(layouts[index_next]);
                switch_layouts(layouts, index_next);
            }
        });
    }



}