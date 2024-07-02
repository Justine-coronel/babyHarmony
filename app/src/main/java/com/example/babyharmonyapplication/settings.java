package com.example.babyharmonyapplication;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class settings extends AppCompatActivity {

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.ajustes);

        }
    public void terminos(View view) {
        Intent intent = new Intent(settings.this,  terminosycondiciones.class);
        startActivity(intent);
    }
    public void irperfil(View view) {
        Intent intent = new Intent(settings.this,  perfilCli.class);
        startActivity(intent);
    }

    public void navigateBack(View view) {
            getOnBackPressedDispatcher().onBackPressed();
    }
}
