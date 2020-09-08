package com.tecnara.granja;


import com.tecnara.granja.Granja;
import matadero.Matadero;

public class Gallina extends Granja implements Matadero {
    @Override
    public int getNumAnimales() {
        return super.getNumAnimales();
    }

    @Override
    public void setNumAnimales(int numAnimales) {
        super.setNumAnimales(numAnimales);
    }

    int numGallinas = 100;


    @Override
    public int sacrificarPavo() {
        numGallinas--;
        return numGallinas;

    }


} 
