package com.example.proyectojose;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void login(View v){

        EditText campo1 = this.findViewById(R.id.correo);
        String correo =  campo1.getText().toString();

        EditText campo2 = this.findViewById(R.id.contrasenia);
        String contrasenia =campo2.getText().toString();

        //System.out.println(correo+" "+contrasenia);

        if(correo.equals("") && contrasenia.equals("")){
            Intent i = new Intent(this,Primera.class);
            startActivity(i);
        }else{
            Toast.makeText(this,"Error en el correo o contraseña, intenta denuevo", Toast.LENGTH_SHORT).show();
        }

    }



    public void crearCuenta(View v){
        Intent i = new Intent(this,RegistrarCuenta.class);
        startActivity(i);
    }

}

