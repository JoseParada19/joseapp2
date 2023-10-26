package com.example.proyectojose;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;


public class Primera extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primera);
        Toolbar tb = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(tb);

        TabLayout tl = (TabLayout) findViewById(R.id.tablayout);
        tl.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                //codificar cosas a ejecutar cuando apretas una pestaña
                int position = tab.getPosition();

                switch (position){
                    case 0:
                        //llama al fragmento campeonatoF
                        HomeF f0 = new HomeF();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor1,f0).commit();
                        Toast.makeText(getApplicationContext(),"Home", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        //llama al fragmento campeonatoF
                        CampeonatoF f1 = new CampeonatoF();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor1,f1).commit();
                        Toast.makeText(getApplicationContext(),"Campeonatos", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        //Llamar al fragmento ligasF
                        LigasF f2 = new LigasF();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor1,f2).commit();
                        Toast.makeText(getApplicationContext(),"Ligas", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        //Llamar a EquipoF
                        EquiposF f3 = new EquiposF();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor1,f3).commit();
                        Toast.makeText(getApplicationContext(),"Equipo", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        //Llamar al fragmento EstadisticasF
                        EstadisticasF f4 = new EstadisticasF();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor1,f4).commit();
                        Toast.makeText(getApplicationContext(),"Estadisticas", Toast.LENGTH_SHORT).show();
                        break;

                }

            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                //codificar cosas a ejecutar cuando una pestaña deja de estar seleccionado
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                //codificar cosas a ejecutar cuando una pestaña se vuelve a seleccionar
            }
        });

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

    //campeonato


    public void crearcampeonato(View v){
        Intent i = new Intent(this, CrearCampeonatos.class);
        startActivity(i);
    }

    public void crearfinalizar(View v){
        Intent i = new Intent(this, HomeF.class);
        startActivity(i);

    }
    public void homecrearcampeonato(View v){
        Intent i = new Intent(this, HomeF.class);
        startActivity(i);
    }




    //ligas

    public void creatuligaF(View v){
        Intent i = new Intent(this, CrearLigas.class);
        startActivity(i);
    }

    public void home90(View v){
        Intent i = new Intent(this, Primera.class);
        startActivity(i);
    }

    public void crearalgo1(View v){
        System.out.println("ALOOOOOOOO");
        Intent i = new Intent(this, Primera.class);
        startActivity(i);
        System.out.println("CHAOOOOO");
    }







//equipos

    public void creatuequiponuevo(View v){
        Intent i = new Intent(this, selecciondeequipo.class);
        startActivity(i);
    }
//estadisticas
}