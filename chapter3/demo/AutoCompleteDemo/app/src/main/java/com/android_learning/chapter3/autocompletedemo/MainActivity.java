package com.android_learning.chapter3.autocompletedemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, COUNTRIES);
        AutoCompleteTextView tv1 = (AutoCompleteTextView) findViewById(R.id.text1);
        tv1.setAdapter(adapter);

        MultiAutoCompleteTextView tv2 = (MultiAutoCompleteTextView) findViewById(R.id.text2);
        tv2.setAdapter(adapter);
        tv2.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }

    static final String[] COUNTRIES = new String[] {
            "Apple", "Banana", "Cherry", "Coconut",
            "Grape", "Kiwifruit", "Antarctica", "Antigua and Barbuda", "Argentina",
            "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan",
            "Bahrain", "Bangladesh", "Lemon", "Mango", "Orange",
            "Peach", "Pear", "Pitaya", "Strawberry", "Sugarcane",
            "Watermelon"
    };
}
