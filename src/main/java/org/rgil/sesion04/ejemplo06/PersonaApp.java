package org.rgil.sesion04.ejemplo06;

public class PersonaApp {
    public static void main(String[] args) {

        //Declarar la persona con constructor con datos
        Persona masPersona = new Persona("Marcos","+34 680204046",  "Calle Mayor 146", 340);
        System.out.println(masPersona);
        Persona charo = new Persona("charo", "+34 680", " Salamanca", 59);
        System.out.println(charo);

        charo.setEdad(44);
        System.out.println(charo.getEdad());




    }
}
