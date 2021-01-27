package com.piramide.dao;

import com.piramide.dao.ciudadanos.DAOCiudadanos;
import com.piramide.dao.ciudadanos.DAOCiudadanosRAM;

public class DAOFactory {

    private static DAOFactory daoFactory;

    //factories
    private DAOCiudadanos daoCiudadanos = null;

    private DAOFactory(){}

    public static DAOFactory getInstance() {
        if(daoFactory == null){
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }

    public DAOCiudadanos getDaoCiudadanos() {
        if(daoCiudadanos == null){
            daoCiudadanos = new DAOCiudadanosRAM();
        }
        return daoCiudadanos;
    }
}
