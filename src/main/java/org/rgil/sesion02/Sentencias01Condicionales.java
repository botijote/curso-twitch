package org.rgil.sesion02;

public class Sentencias01Condicionales {
    public static void main(String[] args) {
        //comparacion de Objetos
        String cadena1="";
        String cadena2 ="";
        if (cadena1.equals(cadena2)){
        System.out.println("Las dos cadenas son iguales");
        }
    //
        String nombreUsuario ="admin";
        switch (nombreUsuario){
            case "espepesan":
                System.out.println("Es Pepesan");;
                break;
            case "admin":
            System.out.println("El usuario es el administradoe");
                break;
            default:
                System.out.print("No es pepesan");

        }
        //
       nombreUsuario ="natalia";
        switch (nombreUsuario){
            case "espepesan", "natalia":
                System.out.println("Es un usuario normal");;
                break;
            case "admin":
                System.out.println("El usuario es el administradoe");
                break;
            default:
                System.out.print("No es pepesan, ni Natalia, ni admin");

        }

    }
}
