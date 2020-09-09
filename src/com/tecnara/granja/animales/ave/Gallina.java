package com.tecnara.granja.animales.ave;


import com.tecnara.granja.animales.Ave;
import com.tecnara.granja.pastorear.IPastoreable;


public class Gallina extends Ave implements IPastoreable {



    public Gallina(String nombre) {
        super(nombre);
    }



    @Override
    public void pastorear() {
        System.out.println("Hola soy la " + getNombre() + "estoy pastoreando");
    }
}