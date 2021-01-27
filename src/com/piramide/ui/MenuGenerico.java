package com.piramide.ui;

import java.util.Scanner;

public abstract class MenuGenerico {
    public void muestra(){
        while (true){
            System.out.print("1) Registro\n2) Búsqueda\nOtro) Salida\nOpción: ");
            Scanner scanner = new Scanner(System.in);
            int opcion = Integer.parseInt(scanner.nextLine());
            if(opcion==1){
                registra();
            }
            else if(opcion == 2){
                busca();
            }
            else{
                return;
            }
        }
    }

    protected abstract void registra();
    protected abstract void busca();

}
