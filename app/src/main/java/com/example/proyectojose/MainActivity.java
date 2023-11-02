package com.example.proyectojose;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.Firebase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private EditText correoingresar, contraseniaingresar;
    private FirebaseFirestore db;
    static final int REQUEST_IMAGE_CAPTURE = 1;
    private StorageReference mStorage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        correoingresar= findViewById(R.id.correo);
        contraseniaingresar= findViewById(R.id.contrasenia);

        db= FirebaseFirestore.getInstance();

        Button datoslogin = findViewById(R.id.botonIngresarLogin);


        mStorage = FirebaseStorage.getInstance().getReference();
    }

    private void GuardarDatosBD(){
        String usuario = correoingresar.getText().toString();
        String contra = contraseniaingresar.getText().toString();



        Map<String, Object> datos = new HashMap<>();
        datos.put("Usuario",usuario);
        datos.put("Contraseña", contra);


        db.collection("Login")
                .add(datos)
                .addOnSuccessListener(documentReference -> {
                    Toast.makeText(getApplicationContext(), "Datos guardados", Toast.LENGTH_SHORT).show();
                })
                .addOnFailureListener(e -> {
                    Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
                });

    }



    public void login(View v){

        EditText campo1 = this.findViewById(R.id.correo);
        String correo =  campo1.getText().toString();

        EditText campo2 = this.findViewById(R.id.contrasenia);
        String contrasenia =campo2.getText().toString();

        //System.out.println(correo+" "+contrasenia);

        if(correo.equals("jose@gmail.com") && contrasenia.equals("12345")){
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

