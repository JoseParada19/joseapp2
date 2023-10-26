package com.example.proyectojose;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CrearLigas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_ligas);
    }

    public void home90(View v){
        Intent i = new Intent(this, HomeF.class);
        startActivity(i);
    }

    public void crearalgo1(View v){
        System.out.println("ALOOOOOOOO");
        Intent i = new Intent(this, HomeF.class);
        startActivity(i);
        System.out.println("CHAOOOOO");
    }

}