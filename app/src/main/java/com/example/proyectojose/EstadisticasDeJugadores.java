package com.example.proyectojose;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EstadisticasDeJugadores extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadisticas_de_jugadores);
    }

    public void homeestadisticasjugadores(View v){
        Intent i = new Intent(this, Primera.class);
        startActivity(i);
    }
}