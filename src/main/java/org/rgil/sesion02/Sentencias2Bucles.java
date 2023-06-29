package org.rgil.sesion02;

public class Sentencias2Bucles    {
    public static void main(String[] args) {
        //buble while
        System.out.println("Antes del bcvle");
        int i = 0;
        while (i<2){
            System.out.println(i);
            i++;
        }
        System.out.println("Despues del bucle");

        //bucle for
        System.out.println("Bucle for con 3 vueltass");
        for (i=0; i<3; i++){
            System.out.println(i);
        }

        //buble do-while

        i=0;
        System.out.println("Bucle do-while con 3 vueltas");
        do {
            System.out.println(i);
            i++;
        }while (i<3);
    }
}
