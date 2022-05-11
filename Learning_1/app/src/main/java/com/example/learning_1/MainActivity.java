package com.example.learning_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
// for print log
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "ccsl";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");

    }
    @Override
    protected  void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
    }

}
