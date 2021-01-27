package com.piramide.ui;

import com.piramide.dao.DAOFactory;
import com.piramide.entities.Ciudad;

import java.util.Scanner;

public class MenuCiudades extends MenuGenerico{

    @Override
    public void registra() {
        System.out.println("Registro de ciudades:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserta nombre: ");
        String nombre = scanner.nextLine();
        Ciudad ciudad = new Ciudad(nombre);
        DAOFactory.getInstance().getDaoCiudades().registra(ciudad);
    }

    @Override
    public void busca() {
        System.out.println("Búsqueda de ciudades:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserta nombre: ");
        String nombre = scanner.nextLine();
        Ciudad ciudad = DAOFactory.getInstance().getDaoCiudades().busca(nombre);
        if(ciudad != null){
            System.out.println(ciudad);
        }
        else{
            System.out.println("No existe ciudad con el nombre "+nombre);
        }
    }
}
