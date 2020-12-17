package com.example.simpletodo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

public class PopActivity extends AppCompatActivity {

    Button yesBtn;
    Button noBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitvity_pop);

        yesBtn = findViewById(R.id.yesBtn);
        noBtn = findViewById(R.id.noBtn);

        getSupportActionBar().setTitle("Delete Item?");
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getRealMetrics(dm);
        int w =  dm.widthPixels;
        int h = dm.heightPixels;
        getWindow().setLayout((int)(w*.95),(int)(h*.18));


        yesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra(MainActivity.KEY_DELETE_RESULT, true);
                intent.putExtra(MainActivity.KEY_ITEM_POSITION, getIntent().getExtras().getInt(MainActivity.KEY_ITEM_POSITION));

                setResult(RESULT_OK,intent);
                // finish activity. close the screen
                finish();

            }
        });

        noBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra(MainActivity.KEY_DELETE_RESULT, false);
                intent.putExtra(MainActivity.KEY_ITEM_POSITION, getIntent().getExtras().getInt(MainActivity.KEY_ITEM_POSITION));

                setResult(RESULT_OK,intent);
                // finish activity. close the screen
                finish();
            }
        });



    }
}
