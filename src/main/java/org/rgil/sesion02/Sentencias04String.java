package org.rgil.sesion02;

public class Sentencias04String {
    public static void main(String[] args) {

        String usuario = "pepesan";

        System.out.println("la longitud de la cadena es " + usuario.length());
        for(int i=0; i<usuario.length(); i++){
            System.out.println(usuario.charAt(i));
        }
        //POner en mayusculas
        System.out.println(usuario.toUpperCase());
    }
}
