package com.example.tp2_appmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Metodo para el boton siguiente
    public void  Siguiente(View view){
        Intent siguiente =new Intent(this,SegundoActivity.class);
        startActivity(siguiente);
    }
    public void  Siguiente2(View view){
        Intent siguiente =new Intent(this,TercerActivity.class);
        startActivity(siguiente);
    }
    public void  Siguiente3(View view){
        Intent siguiente =new Intent(this,CuartoActivity.class);
        startActivity(siguiente);
    }
}
