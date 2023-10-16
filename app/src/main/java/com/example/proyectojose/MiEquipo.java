package com.example.proyectojose;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MiEquipo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_equipo);
    }

    public void homemiequipo(View v){
        Intent i = new Intent(this, Primera.class);
        startActivity(i);
    }

    public void creatuequipoo(View v) {
        Intent i = new Intent(this, selecciondeequipo.class);
        startActivity(i);
    }
}