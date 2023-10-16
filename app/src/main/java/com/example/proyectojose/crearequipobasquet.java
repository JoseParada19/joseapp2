package com.example.proyectojose;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class crearequipobasquet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crearequipobasquet);
    }


    public void homecrearequipobasquet(View v) {
        Intent i = new Intent(this, Primera.class);
        startActivity(i);
    }

    public void crearyfinalizarbasquett(View v) {
        Intent i = new Intent(this, Primera.class);
        startActivity(i);
    }
}