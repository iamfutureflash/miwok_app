package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        ArrayList<String> numbers = new ArrayList<String>();
        numbers.add("one");
        numbers.add("two");
        numbers.add("three");
        numbers.add("four");
        numbers.add("five");
        numbers.add("six");
        numbers.add("seven");
        numbers.add("eight");
        numbers.add("nine");
        numbers.add("ten");
        numbers.add("eleven");
        LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);

        for(int i=0;i<numbers.size();i++) {
            TextView words = new TextView(this);
            words.setText(numbers.get(i));
            rootView.addView(words);
//            Log.i("NumbersActivity","word at index : " + (i+1) + " " + numbers.get(i));
        }
    }
}