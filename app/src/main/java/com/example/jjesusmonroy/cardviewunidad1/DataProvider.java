package com.example.jjesusmonroy.cardviewunidad1;

/**
 * Created by jjesusmonroy on 25/02/18.
 */

public class DataProvider {

    private String genero,titulo;

    public DataProvider(String genero, String titulo) {
        this.genero = genero;
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getTitulo() {
        return titulo;
    }
}
