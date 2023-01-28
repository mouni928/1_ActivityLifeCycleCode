package com.example.activity_life_cycle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("tag", "My app opened");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("tag", "My app started");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("tag", "My app Restart");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("tag", "My app Paused");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("tag", "My app Resumed");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("tag", "My app Stoped");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("tag", "My app closed");
    }
}