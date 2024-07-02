package com.example.babyharmonyapplication;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class inicio extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }
    public void navigateBack(View view) {
        getOnBackPressedDispatcher().onBackPressed();
    }
    public void olvidarpagina(View view) {
        Intent intent = new Intent(inicio.this,  olvidarcontrasena.class);
        startActivity(intent);
    }

    public void registrase(View view) {
        Intent intent = new Intent(inicio.this,  registrase.class);
        startActivity(intent);
    }

    public void homepage(View view) {
        Intent intent = new Intent(inicio.this,  homepagina.class);
        startActivity(intent);
    }
}
