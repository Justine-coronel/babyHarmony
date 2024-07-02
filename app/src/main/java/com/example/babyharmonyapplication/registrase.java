package com.example.babyharmonyapplication;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class registrase    extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.registrarse);
        }
    public void navigateBack(View view) {
        getOnBackPressedDispatcher().onBackPressed();
    }
}
