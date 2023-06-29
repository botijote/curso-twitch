package org.rgil.sesion03;

import static org.rgil.sesion03.Funciones01Estaticas.*;
public class Funciones01EstaticasApp {
    public static void main(String[] args) {
       //llamada al procedimiento
        nombreFuncion();

        //lamada a funcion
        int i=devuelveEntero();
        System.out.println("Valor de i: " +i);

        //
        i=suma(2,3);
        System.out.println("Sumando 2 + 3 = " +i);

       //
        i = 2;
        int j =3;
        int res = 0;
        res = suma(i,j);
        System.out.println("Sumando i + j = " +res);

        //
        int[] miArray= new int[2];
        miArray[0] = 1;
        miArray[1] = 2;
        res = sumaValores(miArray);
        System.out.println("La suma de valores del array es " + res);

        //
        int [] otroArray = new int[3];
        otroArray[0]= 1;
        otroArray[1]= 2;
        otroArray[2]= 3;
        res = sumaValores(otroArray);
        System.out.println("La suma de valores del otro array es " + res);

    }
}
