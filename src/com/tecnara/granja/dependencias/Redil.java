package com.tecnara.granja.dependencias;

import com.tecnara.granja.animales.ave.Gallina;
import com.tecnara.granja.animales.mamifero.Vaca;
import com.tecnara.granja.pastorear.IPastoreable;

import java.util.ArrayList;
import java.util.List;

public class Redil<Pastoreable> implements IPastoreable {
    List<Pastoreable> rebano = new ArrayList<>();

    public void meterAnimal(Pastoreable animal){
        this.rebano.add(animal);
    }

    public Pastoreable sacarAnimal(){
        if(!this.rebano.isEmpty())
            return this.rebano.remove(0);

        return null;
    }

    public Gallina sacarGallina() {
        for(Pastoreable pastoreable : this.rebano){
            if(pastoreable instanceof Gallina){
                return (Gallina)this.rebano.remove(this.rebano.indexOf(pastoreable));
            }
        }
        return null;
    }

    public Vaca sacarVaca() {
        for(Pastoreable pastoreable : this.rebano){
            if(pastoreable instanceof Vaca){
                return (Vaca)this.rebano.remove(this.rebano.indexOf(pastoreable));
            }
        }
        return null;
    }

    public void pastorearAnimales(){
        for(Pastoreable animal : rebano){
            animal.pastorear();
        }
    }

    public void informarEstado(){
        System.out.println(new StringBuilder().append("Tengo ")
                .append(this.rebano.size())
                .append(" animales. ")
                .append(this.getNumeroDeVacas())
                .append(" vacas y ")
                .append(this.getNumeroDeGallinas())
                .append(" gallinas.")
                .toString());
    }

    public int getNumeroDeVacas(){
        int vacas = 0;
        for(Pastoreable pastoreable : this.rebano){
            if(pastoreable instanceof Vaca){
                vacas++;
            }
        }
        return vacas;
    }

    public int getNumeroDeGallinas(){
        int gallinas = 0;
        for(Pastoreable pastoreable : this.rebano){
            if(pastoreable instanceof Gallina){
                gallinas++;
            }
        }
        return gallinas;
    }

    @Override
    public void pastorear() {

    }
}
}
