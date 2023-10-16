package com.example.proyectojose;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class crearequipofutbol extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crearequipofutbol);
    }

    public void homecrearfutboll(View v) {
        Intent i = new Intent(this, Primera.class);
        startActivity(i);
    }

    public void crearyfinalizarfutboll(View v) {
        Intent i = new Intent(this, Primera.class);
        startActivity(i);
    }




}