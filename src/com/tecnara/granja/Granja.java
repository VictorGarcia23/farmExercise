package com.tecnara.granja;



public abstract class Granja {
    private int numAnimales = 0;

    public void meterAnimales(){
        if (numAnimales < 0){
            numAnimales++;

        }   else{
            System.out.println("ya no pueden entrar mas animales");
        }
    }

    public int getNumAnimales() {
        return numAnimales;
    }

    public void setNumAnimales(int numAnimales) {
        this.numAnimales = numAnimales;
    }


}
