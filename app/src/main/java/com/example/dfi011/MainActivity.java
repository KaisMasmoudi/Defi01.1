package com.example.dfi011;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("MainActivity", "Question 1 : activity_main.xml");
        Log.d("MainActivity", "Question 2 : app_name");
        Log.d("MainActivity", "Question 3 : AVD Manager");
        Log.d("MainActivity", "Question 4 : Info");
    }
}
