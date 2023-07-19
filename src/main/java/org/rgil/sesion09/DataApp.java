package org.rgil.sesion09;

public class DataApp {
    public static void main(String[] args) {
        //Clase sin lombok
        DatoSimple datoSimple = new DatoSimple();
        datoSimple.setName("Marcos");
        datoSimple.setAge(40);
        System.out.println(datoSimple);

        //Clase con lombok
        DatoLombok datoLombok = new DatoLombok();
        datoLombok.setName("Marcos");
        datoLombok.setAge(40);
        System.out.println(datoLombok.getName());
        System.out.println(datoLombok.getAge());
        System.out.println(datoLombok);

        DatoLombok datoLombok1= new DatoLombok("Ines ", 16);
        System.out.println(datoLombok1);
        if (datoLombok.equals(datoLombok1)){
            System.out.println("Los dos datos son iguales");

        }else {
            System.out.println("Los dos objetos son diferentes");
        }
    }
}
