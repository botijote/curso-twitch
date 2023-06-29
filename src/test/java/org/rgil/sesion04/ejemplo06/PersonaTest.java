package org.rgil.sesion04.ejemplo06;

import org.junit.jupiter.api.Test;
import org.rgil.sesion04.ejemplo06 .Persona;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonaTest {
    @Test
    public void testConstructoraSinParametros(){
        //Declaro un objeto de la clase persona
        Persona persona;
        //Ejecuto la funcion constructora de la clase persona
        persona= new Persona();
        //Comprobamos que los datos iniciales son correctos dentro del objeto
        assertEquals("", persona.nombre);
        assertEquals("", persona.tlf);
        assertEquals("", persona.direccion);
        assertEquals(0, persona.getEdad());
    }

    //Prueba que compruebe el constructor con parametros
    @Test
    public void testConstructoriaConParametros(){
        Persona masPersona;
        String nombre= "Marcos";
        String tlf = "+34 680204046";
        String direccion = "Calle Mayor 146";
        int edad= 34;
        //
        masPersona = new Persona(nombre, tlf, direccion,edad);
        //
        assertEquals(nombre, masPersona.nombre);
        assertEquals(tlf, masPersona.tlf);
        assertEquals(direccion, masPersona.direccion);
        assertEquals(edad, masPersona.getEdad());
    }
    @Test
    public void testToString(){
        Persona masPersona;
        String nombre= "Marcos";
        String tlf = "+34 680204046";
        String direccion = "Calle Mayor 146";
        int edad= 34;
        //
       masPersona = new Persona(nombre, tlf, direccion,edad);
        //
        assertEquals("Persona{nombre='Marcos', tlf='+34 680204046', direccion='Calle Mayor 146', edad=34}", masPersona.toString());
    }

    @Test
    public void testGetterYSetterEdad(){
        Persona persona= new Persona();
        assertEquals(0,persona.getEdad());
        persona.setEdad(44);
        assertEquals(44,persona.getEdad());
    }

    @Test
    public void testEquals(){
        //
        String nombre = "";
        String tlf = "";
        String direccion = "";
        int edad =0;
        //
        Persona persona= new Persona(nombre,tlf, direccion, edad);
        Persona persona2= new Persona(nombre,tlf, direccion, edad);
        //
        assertTrue(persona.equals(persona2));
    }
}
