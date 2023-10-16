package com.example.proyectojose;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class selecciondeequipo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecciondeequipo);
    }

    public void homecrearequipofutsal(View v) {
        Intent i = new Intent(this, Primera.class);
        startActivity(i);
    }

    public void crearequipofutsall(View v) {
        Intent i = new Intent(this, crearequipofutsal.class);
        startActivity(i);
    }

    public void crearequipofutboll(View v) {
        Intent i = new Intent(this, crearequipofutsal.class);
        startActivity(i);
    }

    public void crearequipobasquettt(View v) {
        Intent i = new Intent(this, crearequipobasquet.class);
        startActivity(i);
    }

}