package com.piramide.dao.ciudades;

import com.piramide.entities.Ciudad;

public interface DAOCiudades {

    public void registra(Ciudad ciudad);
    public Ciudad busca(String nombre);

}
