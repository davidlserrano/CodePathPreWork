package com.example.simpletodo;


import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Pop extends AppCompatActivity {
    Button yesBtn;
    Button noBtn;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitvity_pop);

        yesBtn = findViewById(R.id.yesBtn);
        noBtn = findViewById(R.id.noBtn);

        getActionBar().setTitle("Delete Item?");
        setContentView(R.layout.acitvity_pop);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getRealMetrics(dm);
        int w =  dm.widthPixels;
        int h = dm.heightPixels;
        //getWindow().setLayout((int)(w*.8),(int)(h*.35));

        yesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra(MainActivity.KEY_DELETE_RESULT, true);

                setResult(RESULT_OK,intent);

            }
        });

        noBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra(MainActivity.KEY_DELETE_RESULT, false);

                setResult(RESULT_OK,intent);
            }
        });


    }
}
