package com.piramide.ui;

import com.piramide.dao.DAOFactory;
import com.piramide.entities.Ciudadano;

import java.util.Scanner;

public class Menu {

    public static void menuPrincipal(){
        while (true){
            System.out.print("1) Registro\n2) Búsqueda\nOtro) Salida\nOpción: ");
            Scanner scanner = new Scanner(System.in);
            int opcion = Integer.parseInt(scanner.nextLine());
            if(opcion==1){
                menuRegistroCiudadanos();
            }
            else if(opcion == 2){
                menuBusquedaCiudadanos();
            }
            else{
                return;
            }
        }
    }

    private static void menuRegistroCiudadanos(){
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

    private static void menuBusquedaCiudadanos(){
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
