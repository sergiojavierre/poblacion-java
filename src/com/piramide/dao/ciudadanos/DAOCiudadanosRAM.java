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
        if(poblacion.containsKey(ciudadano.getDNI())){
            System.out.println("Ya existe un ciudadano con DNI "+ciudadano.getDNI());
        }
        else poblacion.put(ciudadano.getDNI(),ciudadano);
    }
}
