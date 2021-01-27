package com.piramide.dao.ciudadanos;

import com.piramide.entities.Ciudadano;

import java.util.HashMap;

public class DAOCiudadanosRAM implements DAOCiudadanos{

    private HashMap<String,Ciudadano> poblacion;

    public DAOCiudadanosRAM(){
        poblacion = new HashMap<>();
    }

    @Override
    public void registra(Ciudadano ciudadano) {
        poblacion.put(ciudadano.getDNI(),ciudadano);
    }
}
