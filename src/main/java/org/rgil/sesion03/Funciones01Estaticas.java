package org.rgil.sesion03;

public class Funciones01Estaticas {
    //primer ejemplo de funcion
    //Procedimiento, void, no devulve nada
    public static void nombreFuncion(){
        System.out.println("Algo por pantalla");
    }
    //Funcion que Devuelve un valor numerico
    public static int devuelveEntero(){
        return 1+2;
    }

    //
    public static int suma(int i, int j){
        return i+j;
    }

    //Ejemplo suma de valores de un array
    public static int sumaValores(int[] miArray){
        int res=0;
        for (int i:miArray) {
            res +=i;
        }

        return res;
    }

    public static int resta(int i, int j){
        return i-j;
    }

    public static float multi (float f1,float f2){
        return f1*f2;
    }
}
