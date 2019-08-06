package com.example.foodsetgo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nveg(View v){
        Intent intent = new Intent(this, NonVegActivity.class);
        startActivity(intent);
    }

    public void dessert(View v){
        Intent intent = new Intent(this, DessertActivity.class);
        startActivity(intent);
    }

    public void veg(View v){
        Intent intent = new Intent(this, VegActivity.class);
        startActivity(intent);
    }

    public void profile(View v){
        Intent intent = new Intent(this, MyProfile.class);
        startActivity(intent);
    }
}
