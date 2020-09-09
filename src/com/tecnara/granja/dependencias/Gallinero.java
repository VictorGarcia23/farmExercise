package com.tecnara.granja.dependencias;


import com.tecnara.granja.animales.Ave;
import com.tecnara.granja.animales.ave.Gallina;
import com.tecnara.granja.animales.ave.Pavo;

import java.util.ArrayList;
import java.util.List;

public class Gallinero {

    private List<Ave> aves=new ArrayList<Ave>();

    public List<Ave> getAves() { return aves;}

    public void meterAve(Ave ave) {

        aves.add(ave);
        if (ave instanceof Gallina){

            mostrarMensajeInsercion("gallina");
        }
        else if (ave instanceof Pavo){

            mostrarMensajeInsercion("pavo");
        }

    }

    public void mostrarMensajeInsercion(String tipoDeAve){

        System.out.println("Has metido un/a "+tipoDeAve+ ". Tienes " +aves.size()+ " aves metidas, " +getNumeroDeGallinas()+ " gallinas y "
                +getNumeroDePavos()+ " pavos.");

    }

    public void cogerHuevos(){

        if (getNumeroDeGallinas()==0){
            System.out.println("Lo siento, no puedes coger huevos. No hay gallinas");
        }else {
            System.out.println("Has cogido 2 huevos para un rico desayuno!!");
        }

    }

    public int getNumeroDeGallinas(){

        int numeroDeGallinas=0;

        for (Ave ave : aves) {
            if (ave instanceof Gallina){

                numeroDeGallinas++;
            }
        }

        return numeroDeGallinas;
    }

    public int getNumeroDePavos(){

        int numeroDePavos=0;

        for (Ave ave : aves) {
            if (ave instanceof Pavo){

                numeroDePavos++;
            }
        }

        return numeroDePavos;
    }

    public Gallina sacarGallina() {
        return sacarGallina();
    }
}
