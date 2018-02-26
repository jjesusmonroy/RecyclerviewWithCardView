package com.example.jjesusmonroy.cardviewunidad1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by jjesusmonroy on 25/02/18.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.RecyclerViewHolder> {

    private List<DataProvider> list;
    private Context mCtx;

    public Adapter(List<DataProvider> list, Context mCtx) {
        this.list = list;
        this.mCtx = mCtx;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.item_layout,null);
        RecyclerViewHolder holder = new RecyclerViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        DataProvider musica = list.get(position);

        holder.genero.setText(musica.getGenero());
        holder.titulo.setText(musica.getTitulo());
        holder.imagen.setImageDrawable(mCtx.getResources().getDrawable(R.drawable.ic_launcher_background));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView genero,titulo;
        ImageView imagen;
        public RecyclerViewHolder(View itemView) {
            super(itemView);
            genero=itemView.findViewById(R.id.genero);
            titulo=itemView.findViewById(R.id.titulo);
            imagen=itemView.findViewById(R.id.imagen);

        }
    }
}
