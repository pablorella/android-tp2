package com.example.tp2_appmobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class SegundoActivity extends AppCompatActivity {

    //Creamos la instacia del adapatador y el recycler, aguante react native
    private RecyclerView recyclerViewBirra;
    private RecyclerViewAdaptador adaptadorBirra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
        recyclerViewBirra=(RecyclerView)findViewById(R.id.recyclerBirras);
        recyclerViewBirra.setLayoutManager(new LinearLayoutManager(this));
        adaptadorBirra=new RecyclerViewAdaptador(obtenerBirras());
        recyclerViewBirra.setAdapter(adaptadorBirra);
    }
    public List<BirraModelo> obtenerBirras(){
        List<BirraModelo> birra=new ArrayList<>();
        birra.add(new BirraModelo("Cervezas Lager:" +
                "\n","Son cervezas que usan levadura lager que actúa en la parte baja del fermentador. Requieren en general temperaturas de fermentado bajas y tiempos largos. Es habitual que una cerveza lager deba fermentar a menos de 10 grados, muchas veces incluso por debajo de 5 grados y que lo haga durante de uno a tres meses",R.drawable.laguer));
        birra.add(new BirraModelo("Cervezas Ale:" +
                "\n","Las ale, al revés que las lagers, son de fermentación alta, es decir  que la fermentación se produce en la superficie del fermentador. Se suele fermentar a temperaturas que rondan los 19 grados durante periodos cortos que van de 5 a 7 días (seguidos a menudo de una segunda fermentación que tiene como objetivo reducir la turbidez de la cerveza).",R.drawable.ale));
        birra.add(new BirraModelo("Cervezas de trigo:","Son toda una categoría en sí, y son especialmente importantes en Alemania. Están hechas total o parcialmente con malta de trigo, son claras de color y de baja graduación. Se fermentan con levadura ale. La más conocida, la cerveza blanca, la weisse beer, que hace las delicias del Oktober Fest en Munich y que tiene una variante también maravillosa en Berlín.",R.drawable.detrigo));
        birra.add(new BirraModelo("Pale Ale: "," toda una familia de cervezas ale de color claro, elaboradas con pequeñas proporciones de malta tostada. Pero que el color no os engañe: suelen ser cervezas con mucho lúpulo y por lo tanto con mucho sabor, algunas de ellas incluso bastante amargas. Destacan en esta categoría las IPA (Indian Pale Ale), una cerveza muy alcohólica y rica en lúpulo diseñada para aguantar largas travesías hasta la India.",R.drawable.paleale));
        birra.add(new BirraModelo("Dark Ales:","si pale ale significa ale pálida, pues tenía que haber ales oscuras, es decir las dark ales. Se trata de las Stouts y las Porters que describimos a continuación.",R.drawable.darales));
        birra.add(new BirraModelo("Cervezas Stout: "," a veces llamada cerveza negra en España. Es una cerveza muy oscura, hecha con una buena proporción de maltas tostadas y caramelizadas además de una buena dósis de lúpulo. Son cervezas de textura espesa y cremosa con fuerte aroma a malta y un regusto dulce. Son cervezas ale. La más famosa, pues sin duda la Guiness irlandesa. ",R.drawable.stout));
        birra.add(new BirraModelo("Las cervezas Porter","son para muchos un tipo más de Stout, pero algo menos oscuras y potentes. Son también cervezas ale con un preciosos color y también muy ricas en lúpulo.",R.drawable.porter));
        birra.add(new BirraModelo("Cervezas Belgas: ","Entre las pálidas y las oscuras, hay toda una categoría que viene de Bélgica con toda de los monasterios. Se trata de cervezas de sabor intenso, con buenas dósis de lúpulo pero con el fondo dulce que le dan las maltas ámbar y crystal. El color suele benir marcado por tonos rojizos aunque hay ales belgas que son completamente rubias.",R.drawable.elgas));
        birra.add(new BirraModelo("Barley Wine","se lleva el récor alcohólico. Hechas con ingentes cantidades de malta, el resultado inmediato es una cerveza con mucho cuerpo y graduaciones que superan a menudo el 10%. Para beber en copa pequeña como si fuera vino, y de ahí su nombre.",R.drawable.arleywine));

        return birra;
    }



    //Metodo para el boton Anterior
    public void  Anterior(View view){
        Intent anterior =new Intent(this,MainActivity.class);
        startActivity(anterior);
    }
}
