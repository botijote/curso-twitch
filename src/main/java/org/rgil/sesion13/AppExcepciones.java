package org.rgil.sesion13;

public class AppExcepciones {
    public static void main(String[] args) {

        int i = 2;
        int j= 0;
        int res= 0;

        try {
            //Sentencias que queremos ejecutar
            res = i/j;
        }//Se pueden utilizar tantos catch como quereamos o ncesitemos
        catch(ArithmeticException e){
            System.out.println("Excepcion capturada: ArithmeticException ");
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("Excepcion generica");
            System.out.println(e.getMessage());
        }
        System.out.println("Final de codigo");

    }
}
