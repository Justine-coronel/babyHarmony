package com.example.babyharmonyapplication;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

    public class perfilCli  extends AppCompatActivity {

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.perfil);
        }
        public void navigateBack(View view) {
            getOnBackPressedDispatcher().onBackPressed();
        }

    }


