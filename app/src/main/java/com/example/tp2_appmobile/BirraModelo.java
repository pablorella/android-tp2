package com.example.tp2_appmobile;

public class BirraModelo {
    private String birra,descripcion_birra;
    private int fotoBirra;

    public BirraModelo() {
    }

    public BirraModelo(String birra, String descripcion_birra, Integer fotoBirra) {
        this.birra = birra;
        this.descripcion_birra = descripcion_birra;
        this.fotoBirra = fotoBirra;
    }
    //los getters y setters

    public String getBirra() {
        return birra;
    }

    public void setBirra(String birra) {
        this.birra = birra;
    }

    public String getDescripcion_birra() {
        return descripcion_birra;
    }

    public void setDescripcion_birra(String descripcion_birra) {
        this.descripcion_birra = descripcion_birra;
    }

    public Integer getFotoBirra() {
        return fotoBirra;
    }

    public void setFotoBirra(Integer fotoBirra) {
        this.fotoBirra = fotoBirra;
    }




}
