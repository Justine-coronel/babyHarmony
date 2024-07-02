package com.example.babyharmonyapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class piernas extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.piernas_seccion);
    }
    public void navigateBack(View view) {
        getOnBackPressedDispatcher().onBackPressed();
    }


    public void navigateSettings(View view) {
        Intent intent = new Intent(piernas.this,  settings.class);
        startActivity(intent);
    }
    // Onclicks de la barra de navegacion
    public void onHomeClick(View view) {
        resetSelection();
        view.setSelected(true);
        Intent intent = new Intent(piernas.this,  homepagina.class);
        startActivity(intent);
    }

    public void onAprenderClick(View view) {
        resetSelection();
        view.setSelected(true);
        Intent intent = new Intent(piernas.this,  aprenderCli.class);
        startActivity(intent);
    }

    public void onMiBebeClick(View view) {
        resetSelection();
        view.setSelected(true);
        Intent intent = new Intent(piernas.this,  mibebeCli.class);
        startActivity(intent);
    }

    public void onPerfilClick(View view) {
        resetSelection();
        view.setSelected(true);
        Intent intent = new Intent(piernas.this,  perfilCli.class);
        startActivity(intent);
    }
    private void resetSelection() {
        findViewById(R.id.home_boton).setSelected(false);
        findViewById(R.id.aprender_boton).setSelected(false);
        findViewById(R.id.bebe_boton).setSelected(false);
        findViewById(R.id.perfil_boton).setSelected(false);
    }

    public void pie(View view) {
        Intent intent = new Intent(piernas.this, pie.class);
        startActivity(intent);
    }
    public void rodilla(View view) {
        Intent intent = new Intent(piernas.this,  rodilla.class);
        startActivity(intent);
    }
    public void muslos(View view) {
        Intent intent = new Intent(piernas.this,  muslos.class);
        startActivity(intent);
    }

}
