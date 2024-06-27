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

        TextView txtTerminos = findViewById(R.id.txt_terminos);

        String text = "Al continuar aceptas los términos y condiciones";
        SpannableString spannableString = new SpannableString(text);

        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View view) {
                // Aquí defines lo que sucede cuando se hace clic en "términos y condiciones"
                Intent intent = new Intent(MainActivity.this,   MainActivity.class);
                startActivity(intent);
            }
        };

        int start = text.indexOf("términos y condiciones");
        int end = start + "términos y condiciones".length();

        spannableString.setSpan(clickableSpan, start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(new ForegroundColorSpan(Color.BLUE), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(new UnderlineSpan(), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        txtTerminos.setText(spannableString);
        txtTerminos.setMovementMethod(LinkMovementMethod.getInstance());
    }
    public void onHomeClick(View view) {
        resetSelection();
        view.setSelected(true);
        // Navegar a la página de Home
    }

    public void onAprenderClick(View view) {
        resetSelection();
        view.setSelected(true);
        // Navegar a la página de Aprender
    }

    public void onMiBebeClick(View view) {
        resetSelection();
        view.setSelected(true);
        // Navegar a la página de Mi Bebé
    }

    public void onPerfilClick(View view) {
        resetSelection();
        view.setSelected(true);
        // Navegar a la página de Perfil
    }

    private void resetSelection() {
        findViewById(R.id.home_boton).setSelected(false);
        findViewById(R.id.aprender_boton).setSelected(false);
        findViewById(R.id.bebe_boton).setSelected(false);
        findViewById(R.id.perfil_boton).setSelected(false);
    }


    ImageView cabezaImage = findViewById(R.id.cabeza_image);
    ImageView torsoImage = findViewById(R.id.torso_image);
    ImageView brazosImage = findViewById(R.id.brazos_image);
    ImageView piernasImage = findViewById(R.id.piernas_image);

        cabezaImage.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, CabezaActivity.class);
            startActivity(intent);
        }
    });

        torsoImage.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, TorsoActivity.class);
            startActivity(intent);
        }
    });

        brazosImage.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, BrazosActivity.class);
            startActivity(intent);
        }
    });

        piernasImage.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, PiernasActivity.class);
            startActivity(intent);
        }
    });
}
}



