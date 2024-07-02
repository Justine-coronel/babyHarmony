package com.example.babyharmonyapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class homepagina extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.home);
        }

//ir a configuracion
    public void navigateSettings(View view) {
        Intent intent = new Intent(homepagina.this,  settings.class);
        startActivity(intent);
    }

    // Onclicks de la barra de navegacion
    public void onHomeClick(View view) {
        resetSelection();
        view.setSelected(true);
        Intent intent = new Intent(homepagina.this,  homepagina.class);
        startActivity(intent);
    }

    public void onAprenderClick(View view) {
        resetSelection();
        view.setSelected(true);
        Intent intent = new Intent(homepagina.this,  aprenderCli.class);
        startActivity(intent);
    }

    public void onMiBebeClick(View view) {
        resetSelection();
        view.setSelected(true);
        Intent intent = new Intent(homepagina.this,  mibebeCli.class);
        startActivity(intent);
    }

    public void onPerfilClick(View view) {
        resetSelection();
        view.setSelected(true);
        Intent intent = new Intent(homepagina.this,  perfilCli.class);
        startActivity(intent);
    }
    private void resetSelection() {
        findViewById(R.id.home_boton).setSelected(false);
        findViewById(R.id.aprender_boton).setSelected(false);
        findViewById(R.id.bebe_boton).setSelected(false);
        findViewById(R.id.perfil_boton).setSelected(false);
    }

}
