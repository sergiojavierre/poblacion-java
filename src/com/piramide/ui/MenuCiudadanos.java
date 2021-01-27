package com.piramide.ui;

import com.piramide.dao.DAOFactory;
import com.piramide.entities.Ciudadano;

import java.util.Scanner;

public class MenuCiudadanos extends MenuGenerico{

    public void registra(){
        System.out.println("Registro de ciudadanos:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserta DNI: ");
        String DNI = scanner.nextLine();
        System.out.print("Inserta nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Inserta apellidos: ");
        String apellidos = scanner.nextLine();
        Ciudadano ciudadano = new Ciudadano(DNI,nombre,apellidos);
        DAOFactory.getInstance().getDaoCiudadanos().registra(ciudadano);
    }

    public void busca(){
        System.out.println("Búsqueda de ciudadanos:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserta el DNI a buscar: ");
        String DNI = scanner.nextLine();
        Ciudadano ciudadano = DAOFactory.getInstance().getDaoCiudadanos().busca(DNI);
        if(ciudadano == null){
            System.out.println("No hay ciudadanos con DNI "+DNI);
        }
        else{
            System.out.println(ciudadano);
        }
    }

}
