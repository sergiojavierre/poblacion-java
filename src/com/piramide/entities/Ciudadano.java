package com.piramide.entities;

import java.util.ArrayList;
import java.util.List;

public class Ciudadano {
    private String DNI, nombre, apellidos;
    private List<Ciudadano> progenitores, descendientes;

    public Ciudadano(String DNI, String nombre, String apellidos) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.progenitores = new ArrayList<>();
        this.descendientes = new ArrayList<>();
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void addProgenitor(Ciudadano ciudadano){
        this.progenitores.add(ciudadano);
    }

    public List<Ciudadano> getProgenitores() {
        return progenitores;
    }

    public void addDescendiente(Ciudadano ciudadano){
        this.descendientes.add(ciudadano);
    }

    public List<Ciudadano> getDescendientes() {
        return descendientes;
    }

    @Override
    public String toString() {
        return "Ciudadano{" +
                "DNI='" + DNI + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", progenitores=" + progenitores +
                ", descendientes=" + descendientes +
                '}';
    }
}
