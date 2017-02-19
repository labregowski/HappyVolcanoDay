package com.volcanoday.happyvolcanoday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      // getSupportActionBar().hide(); NONeed - AxtionBar is removed in styles by calling NOActionBAr parent...
    }
}
