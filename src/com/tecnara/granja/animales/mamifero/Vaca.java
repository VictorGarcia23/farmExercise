package com.tecnara.granja.animales.mamifero;


import com.tecnara.granja.animales.Mamifero;
import com.tecnara.granja.pastorear.IPastoreable;

public class Vaca extends Mamifero implements IPastoreable {
    public Vaca(String nombre) {
        super(nombre);
    }



    @Override
    public void pastorear() {
        System.out.println("Hola soy la " + getNombre() + "estoy pastoreando");
    }
}