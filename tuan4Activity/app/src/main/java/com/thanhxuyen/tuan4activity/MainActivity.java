package com.thanhxuyen.tuan4activity;

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
    public void moveTo(View view){
        Intent intent = new Intent( MainActivity.this, manhinh2.class);
        startActivity(intent);
    }
}