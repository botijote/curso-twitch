package org.rgil.sesion02;

public class Sentencias03Arrays {
    public static void main(String[] args) {
        System.out.println("Ejemplos bucles con arrays");
        //Un array es un conjunto ordenado de elementos/variables del mismo tipo

        //definicion de Array
        int[] miArray;
        //inicializacion del array
        miArray= new int[2];

        //Valor y acceso a l aprimera posicion del array
        miArray[0]=5;
        System.out.println("miArray[0] es " +miArray[0]);
        miArray[1] = 7;
        System.out.println("miArray[1] es " +miArray[1]);

        //Recorrer un array
        for (int i=0; i<2; i++){
            System.out.println("miarray ["+i+"]="+ miArray[i]);
        }
        //recorrer usando bucle foreach
        System.out.println("Recorrer usando bucle foreach");
        for (int numero: miArray){
            System.out.println(numero);
        }

        //foreach con array grande
       int arrayGrande[]= {1,3,5,7,9,0};
        System.out.println();
        for (int numero:arrayGrande) {
            System.out.println(numero);
        }
    }
}
