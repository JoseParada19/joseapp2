package com.example.proyectojose;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MisCampeonatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mis_campeonatos);
    }

    public void crearcampeonato(View v){
        Intent i = new Intent(this,CrearCampeonatos.class);
        startActivity(i);
    }
    public void homemiscampeonatoss(View v){
        Intent i = new Intent(this, Primera.class);
        startActivity(i);
    }

}


