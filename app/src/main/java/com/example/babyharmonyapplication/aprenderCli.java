package com.example.babyharmonyapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
public class aprenderCli  extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aprender_seccion);
    }
    public void navigateBack(View view) {
        getOnBackPressedDispatcher().onBackPressed();
    }


    public void navigateSettings(View view) {
        Intent intent = new Intent(aprenderCli.this,  settings.class);
        startActivity(intent);
    }
    // Onclicks de la barra de navegacion
    public void onHomeClick(View view) {
        resetSelection();
        view.setSelected(true);
        Intent intent = new Intent(aprenderCli.this,  homepagina.class);
        startActivity(intent);
    }

    public void onAprenderClick(View view) {
        resetSelection();
        view.setSelected(true);
        Intent intent = new Intent(aprenderCli.this,  aprenderCli.class);
        startActivity(intent);
    }

    public void onMiBebeClick(View view) {
        resetSelection();
        view.setSelected(true);
        Intent intent = new Intent(aprenderCli.this,  mibebeCli.class);
        startActivity(intent);
    }

    public void onPerfilClick(View view) {
        resetSelection();
        view.setSelected(true);
        Intent intent = new Intent(aprenderCli.this,  perfilCli.class);
        startActivity(intent);
    }
    private void resetSelection() {
        findViewById(R.id.home_boton).setSelected(false);
        findViewById(R.id.aprender_boton).setSelected(false);
        findViewById(R.id.bebe_boton).setSelected(false);
        findViewById(R.id.perfil_boton).setSelected(false);
    }


    public void cabezaSeccion(View view) {
        Intent intent = new Intent(aprenderCli.this,  cabeza.class);
        startActivity(intent);
    }
    public void torsoSeccion(View view) {
        Intent intent = new Intent(aprenderCli.this,  torso.class);
        startActivity(intent);
    }
    public void brazosSeccion(View view) {
        Intent intent = new Intent(aprenderCli.this,  brazos.class);
        startActivity(intent);
    }
    public void pieSeccion(View view) {
        Intent intent = new Intent(aprenderCli.this,  piernas.class);
        startActivity(intent);
    }

}
