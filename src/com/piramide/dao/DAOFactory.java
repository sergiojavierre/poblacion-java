package com.piramide.dao;

import com.piramide.dao.ciudadanos.DAOCiudadanos;
import com.piramide.dao.ciudadanos.DAOCiudadanosRAM;
import com.piramide.dao.ciudades.DAOCiudades;
import com.piramide.dao.ciudades.DAOCiudadesRAM;

public class DAOFactory {

    private static DAOFactory daoFactory;

    //factories
    private DAOCiudadanos daoCiudadanos = null;
    private DAOCiudades daoCiudades = null;

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

    public DAOCiudades getDaoCiudades() {
        if(daoCiudades == null){
            daoCiudades = new DAOCiudadesRAM();
        }
        return daoCiudades;
    }
}
