package org.rgil.sesion12;

public class ImprimeAnimal <Tipo extends Animal>{

    private Animal animal;

    ImprimeAnimal (Animal animal){
        this.animal = animal;
    }

    public void imprime(){
        System.out.println(this.animal);
    }
}
