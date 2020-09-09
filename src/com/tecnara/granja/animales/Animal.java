package com.tecnara.granja.animales;

public class Animal {

    private String nombre;

    public String dameNombreAnimal() {
        return nombre;
    }

    public Animal (String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }
}