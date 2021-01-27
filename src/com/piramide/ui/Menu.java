package com.piramide.ui;

import com.piramide.entities.Ciudadano;

import java.util.Scanner;

public class Menu {

    public static void menuRegistroCiudadanos(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserta DNI: ");
        String DNI = scanner.nextLine();
        System.out.print("Inserta nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Inserta apellidos: ");
        String apellidos = scanner.nextLine();
        Ciudadano ciudadano = new Ciudadano(DNI,nombre,apellidos);
    }

}
