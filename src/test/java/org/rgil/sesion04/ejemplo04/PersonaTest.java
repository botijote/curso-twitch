package org.rgil.sesion04.ejemplo04;

import org.junit.jupiter.api.Test;
import org.rgil.sesion04.ejemplo04.Persona;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        assertEquals(0, persona.edad);
    }

    //Prueba que compruebe el constructor con parametros
    @Test
    public void testConstructoriaConParametros(){
        Persona masPersona;
        String nombre= "Marcos";
        String tlf = "+34 680204046";
        String direccion = "Calle Mayor 146";
        int edad= 34;
        masPersona = new Persona(nombre, tlf, direccion,edad);
        //
        assertEquals(nombre, masPersona.nombre);
        assertEquals(tlf, masPersona.tlf);
        assertEquals(direccion, masPersona.direccion);
        assertEquals(edad, masPersona.edad);
    }
}
