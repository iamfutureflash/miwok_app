package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        String[] words = {"one","two","three","four","five","six","seven","eight","nine","ten"};
        for(int i=0;i<words.length;i++) {
            Log.i("NumbersActivity","word at index : " + i + " " + words[i]);
        }
    }
}