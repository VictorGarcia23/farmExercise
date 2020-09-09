package com.tecnara.granja;

import com.tecnara.granja.animales.Animal;
import com.tecnara.granja.animales.ave.Gallina;
import com.tecnara.granja.animales.mamifero.Vaca;
import com.tecnara.granja.dependencias.Establo;
import com.tecnara.granja.dependencias.Gallinero;
import com.tecnara.granja.dependencias.Redil;

public class Granjero {
    public void llevarGallinaARedil(Gallinero gallinero, Redil redil) {
        Gallina gallina = gallinero.sacarGallina();
        if (gallina != null) {
            calmarAnimal(gallina);
            redil.meterAnimal(gallina);
        } else {
            System.out.println("No había gallinas para llevar al redil");
        }
    }

    public void llevarVacaARedil(Establo establo, Redil redil) {
        Vaca vaca = establo.sacarVaca();
        if (vaca != null) {
            calmarAnimal(vaca);
            redil.meterAnimal(vaca);
        } else {
            System.out.println("No había vacas para llevar al redil");
        }
    }

    public void calmarAnimal(Animal animal) {
        System.out.println("No te asustes " + animal.getNombre() + ", que te muevo de sitio");
    }

    public void sacarGallinaDelRedil(Gallinero gallinero, Redil redil) {
        Gallina gallina = redil.sacarGallina();
        if (gallina != null) {
            calmarAnimal(gallina);
            gallinero.meterAve(gallina);
        } else {
            System.out.println("No había gallinas para llevar al gallinero");
        }
    }

    public void sacarVacaDelRedil(Establo establo, Redil redil) {
        Vaca vaca = redil.sacarVaca();
        if (vaca != null) {
            calmarAnimal(vaca);
            establo.metermamifero(vaca);
        } else {
            System.out.println("No había vaca para llevar al establo");
        }
    }
}

