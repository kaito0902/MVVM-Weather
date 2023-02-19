package com.sghh.mvvm_weather.ui.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.sghh.mvvm_weather.R;

public class StartActivity extends AppCompatActivity implements View.OnClickListener {

    private String TAG = StartActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        findViewById(R.id.loginButton).setOnClickListener(this);
        findViewById(R.id.registerButton).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        // 押されたボタンのidを取得
        int id = view.getId();

        // 押されたボタンのidによって条件分岐
        switch (id) {
            case R.id.loginButton:
                Log.d(TAG, "loginButton");
                break;
            case R.id.registerButton:
                Log.d(TAG, "registerButton");
                break;
        }
    }
}