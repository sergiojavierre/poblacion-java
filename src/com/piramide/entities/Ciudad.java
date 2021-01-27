package com.piramide.entities;

import java.util.ArrayList;
import java.util.List;

public class Ciudad {

    private String nombre;
    private List<Ciudadano> ciudadanos;

    public Ciudad(String nombre) {
        this.nombre = nombre;
        this.ciudadanos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void addCiudadano(Ciudadano ciudadano){
        this.ciudadanos.add(ciudadano);
    }

    public List<Ciudadano> getCiudadanos() {
        return ciudadanos;
    }
}
