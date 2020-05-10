package com.example.tp2_appmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class TercerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercer);
    }
    //Metodo para el boton Anterior
    public void  Anterior(View view){
        Intent anterior =new Intent(this,MainActivity.class);
        startActivity(anterior);
    }
    public void Selection (View view ){
        switch (view.getId()){
            case R.id.ale:
                Toast.makeText(this,"Categoria: Cerveza Ale",Toast.LENGTH_SHORT).show();
                break;
            case R.id.barley_wine:
                Toast.makeText(this,"Categoria: Cerveza Barley Wine",Toast.LENGTH_SHORT).show();
                break;
            case R.id.dark_ales:
                Toast.makeText(this,"Categoria: Cerveza Dark Ales",Toast.LENGTH_SHORT).show();
                break;
            case R.id.pale_ale:
                Toast.makeText(this,"Categoria: Cerveza Pale Ale",Toast.LENGTH_SHORT).show();
                break;
            case R.id.laguer:
                Toast.makeText(this,"Categoria: Cerveza Laguer",Toast.LENGTH_SHORT).show();
                break;
            case R.id.porter:
                Toast.makeText(this,"Categoria: Cerveza Porter",Toast.LENGTH_SHORT).show();
                break;
            case R.id.stout:
                Toast.makeText(this,"Categoria: Cerveza Stout",Toast.LENGTH_SHORT).show();
                break;

        }
    }


}
