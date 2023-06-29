package org.rgil.sesion04.ejemplo04;

public class PersonaApp {
    public static void main(String[] args) {


        //Declarar la persona con constructor con datos
        Persona masPersona = new Persona("Marcos","+34 680204046",  "Calle Mayor 146", 340);


        System.out.println(masPersona.nombre);
        System.out.println(masPersona.tlf);
        System.out.println(masPersona.direccion);
        System.out.println(masPersona.edad);


    }
}
