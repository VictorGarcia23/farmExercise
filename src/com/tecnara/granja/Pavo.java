package com.tecnara.granja;

import matadero.Matadero;

public class Pavo extends Granja implements Matadero {
    @Override
    public int getNumAnimales() {
        return super.getNumAnimales();
    }

    @Override
    public void setNumAnimales(int numAnimales) {
        super.setNumAnimales(numAnimales);
    }

    int numPavo = 100;


    @Override
    public int sacrificarPavo() {
        numPavo--;
        return numPavo;
    }
}
