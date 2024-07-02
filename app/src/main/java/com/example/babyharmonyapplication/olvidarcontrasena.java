package com.example.babyharmonyapplication;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class olvidarcontrasena extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reset_password);
    }
    public void navigateBack(View view) {
        getOnBackPressedDispatcher().onBackPressed();
    }

}
