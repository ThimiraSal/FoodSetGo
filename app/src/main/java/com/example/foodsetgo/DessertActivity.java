package com.example.foodsetgo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DessertActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert);
    }

    public void proceed(View v){
        Intent intent = new Intent(this, FinalizeActivity.class);
        startActivity(intent);
    }

    public void main_menu(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
