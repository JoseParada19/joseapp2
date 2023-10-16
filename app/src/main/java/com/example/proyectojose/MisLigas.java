package com.example.proyectojose;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MisLigas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mis_ligas);
    }

    public void crearLigas(View v){
        Intent i = new Intent(this, CrearLigas.class);
        startActivity(i);
    }

    public void homemisligass(View v){
        Intent i = new Intent(this, Primera.class);
        startActivity(i);
    }

}