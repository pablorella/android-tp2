package com.example.tp2_appmobile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdaptador extends RecyclerView.Adapter<RecyclerViewAdaptador.ViewHolder> {
    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView birra,descripcion_birra;
        ImageView fotoBirra;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            birra=(TextView)itemView.findViewById(R.id.tv_name_birra);
            descripcion_birra=(TextView)itemView.findViewById(R.id.tv_birra_descripcion);
            fotoBirra=(ImageView) itemView.findViewById(R.id.imgBirra);
        }
    }
    public List<BirraModelo> birraLista;

    public RecyclerViewAdaptador(List<BirraModelo> birraLista) {
        this.birraLista = birraLista;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_birrola,parent,false);
        ViewHolder viewHolder= new ViewHolder(view);
        return viewHolder;
    }
    //el bind realiza las mkodificaciones de cada item
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.birra.setText(birraLista.get(position).getBirra());
        holder.descripcion_birra.setText(birraLista.get(position).getDescripcion_birra());
        holder.fotoBirra.setImageResource(birraLista.get(position).getFotoBirra());
    }

    @Override
    public int getItemCount() {
        return birraLista.size();
    }
}








