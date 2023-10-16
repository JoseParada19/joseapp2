package com.example.proyectojose;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class Primera extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primera);
        Toolbar tb = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(tb);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Se incorpora el menu dentro de la activity
        getMenuInflater().inflate(R.menu.menu1,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId(); //Esto recupera el ID de las opciones del menu (mis campeonatos,mis ligas,mi equipo)
        if(id==R.id.MC){
            Toast.makeText(this,"Te dirijes a Mis Campeonatos",Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this,MisCampeonatos.class);
            startActivity(i);
        }
        else if(id==R.id.ML){
            Toast.makeText(this,"Te dirijes a Mis Ligas",Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, MisLigas.class);
            startActivity(i);
        }
        else if(id==R.id.ME){
            Toast.makeText(this,"Te dirijes a Mi Equipo",Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, MiEquipo.class);
            startActivity(i);
        }
        else if(id==R.id.E){
            Toast.makeText(this,"Te dirijes a Estadisticas",Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, EstadisticasDeJugadores.class);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }

    public void regresarlogin(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }



}