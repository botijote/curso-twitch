package org.rgil.sesion12;

public class App {

    public static void main(String[] args) {

        Imprime <String> imprime = new Imprime<>("Dato");
        imprime.Imprime();

        Imprime<Integer> imprime1 = new Imprime<>(1);
        imprime1.Imprime();

       ImprimeAnimal<Animal> imprimeAnimal = new ImprimeAnimal<>(new Animal());
       imprimeAnimal.imprime();

       ImprimeAnimal<Gato> imprimeGato = new ImprimeAnimal<>(new Gato(12, "Misifu"));
       imprimeGato.imprime();
    }
}
