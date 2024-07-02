package com.example.babyharmonyapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.txt_terminos);

        SpannableString spannableString = new SpannableString(getString(R.string.termino));

        ClickableSpan clickableSpan = new ClickableSpan() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, terminosycondiciones.class);
                startActivity(intent);
            }
        };

        spannableString.setSpan(clickableSpan, 0, spannableString.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

    }


    public void navigateBack(View view) {
        getOnBackPressedDispatcher().onBackPressed();
    }

    public void Inicio(View view) {
        Intent intent = new Intent(MainActivity.this,   inicio.class);
        startActivity(intent);
    }


}



