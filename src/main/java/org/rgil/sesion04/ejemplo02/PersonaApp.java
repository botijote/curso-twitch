package org.rgil.sesion04.ejemplo02;

public class PersonaApp {
    public static void main(String[] args) {
       //Declaro e inicializo un objeto de la clase Persona
        Persona persona =new Persona();
        persona.nombre= "Carlos";
        System.out.println(persona);
        System.out.println(persona.nombre);

        //Otro ejmplo de objeto de la clase persona
        Persona otraPersona = new Persona();
        otraPersona.nombre ="Marcos";
        System.out.println(otraPersona.nombre);
    }
}
