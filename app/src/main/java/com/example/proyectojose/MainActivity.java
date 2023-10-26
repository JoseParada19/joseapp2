package com.example.proyectojose;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.Firebase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.BitSet;

public class MainActivity extends AppCompatActivity {
    static final int REQUEST_IMAGE_CAPTURE = 1;
    private StorageReference mStorage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mStorage = FirebaseStorage.getInstance().getReference();
    }

    //public void tomar_foto(View v){
    //    Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
    //    if(takePictureIntent.resolveActivity(getPackageManager())!=null){
    //        startActivityForResult(takePictureIntent,REQUEST_IMAGE_CAPTURE);
    //    }
    //}
//
    //@Override
    //protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
    //    super.onActivityResult(requestCode, resultCode, data);
    //    if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK){
    //        Bundle extras = data.getExtras();
    //        Bitmap imageBitmap = (Bitmap) extras.get("data");
    //        ImageView imFoto = (ImageView) findViewById(R.id.ivFoto);
    //        imFoto.setImageBitmap(Bitmap.createScaledBitmap(imageBitmap,500,500,false));
//
    //    }
    //}


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

