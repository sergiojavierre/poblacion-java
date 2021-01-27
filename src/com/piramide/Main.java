package com.piramide;


import com.piramide.dao.DAOFactory;
import com.piramide.entities.Ciudad;
import com.piramide.ui.Menu;

public class Main {

    public static void main(String[] args) {

        //Menu.menuPrincipal();

        Ciudad ciudadHuesca = new Ciudad("Huesca");
        Ciudad ciudadHuesca2 = new Ciudad("Huesca");
        DAOFactory.getInstance().getDaoCiudades().registra(ciudadHuesca);
        DAOFactory.getInstance().getDaoCiudades().registra(ciudadHuesca2);

    }
}
