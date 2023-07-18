package org.rgil.sesion08.ejemplo01;

public class MainAbstracta {
    public static void main(String[] args) {

        // No esta permitido crar objetos de una clase Abstracta
        //Abstracta abstracta = new Abstracta();

        //Se puede crear un objeto de una clase que herada de la clase abstracta
        HerenciaAbstracta herenciaAbstracta = new HerenciaAbstracta();
        System.out.println(herenciaAbstracta);

        herenciaAbstracta= new HerenciaAbstracta("Valor");
        System.out.println(herenciaAbstracta);

    }
}
