package com.piramide.dao.ciudadanos;

import com.piramide.entities.Ciudadano;

public interface DAOCiudadanos {

    public void registra(Ciudadano ciudadano);
    public Ciudadano busca(String DNI);

}
