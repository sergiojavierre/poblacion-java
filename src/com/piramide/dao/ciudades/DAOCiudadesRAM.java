package com.piramide.dao.ciudades;

import com.piramide.entities.Ciudad;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DAOCiudadesRAM implements DAOCiudades{

    private List<Ciudad> ciudades;

    public DAOCiudadesRAM(){
        this.ciudades = new ArrayList<>();
    }

    @Override
    public void registra(Ciudad ciudad) {
        /*
        Boolean encontrado = false;
        for (int i = 0; i < ciudades.size(); i++) {
            Ciudad actual = ciudades.get(i);
            if(actual.getNombre().equals(ciudad.getNombre())){
                encontrado = true;
                break;
            }
        }
        if(encontrado){
            System.out.println("Ya existe la ciudad "+ciudad.getNombre());
        }
        else this.ciudades.add(ciudad);
         */

        Optional<Ciudad> posibleCiudad = ciudades.stream().filter(ciudadActual->{
            return ciudadActual.getNombre().equals(ciudad.getNombre());
        }).findAny();
        if(posibleCiudad.isPresent()){
            System.out.println("Ya existe la ciudad "+ciudad.getNombre());
        }
        else this.ciudades.add(ciudad);
    }

    @Override
    public Ciudad busca(String nombre) {
        Optional<Ciudad> posibleCiudad = ciudades.stream().filter(ciudadActual->{
            return ciudadActual.getNombre().equals(nombre);
        }).findAny();
        return posibleCiudad.orElse(null);
    }
}
