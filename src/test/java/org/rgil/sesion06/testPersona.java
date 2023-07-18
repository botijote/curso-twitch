package org.rgil.sesion06;

import org.rgil.sesion06.Persona;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testPersona {

    @Test
    public void testConstrutorSinPArametros(){
        //definicion del objeto
        Persona persona;
        //Funcionalidad que quierop probar
        persona = new Persona();
        //Comprobaciones que quiero realizar
        assertEquals("",persona.getNombre());
    }

    @Test
    public void testConstrutorConPArametros(){
        //definicion del objeto
        Persona persona;
        String nombre ="Marcos";
        //Funcionalidad que quierop probar
        persona = new Persona(nombre);
        //Comprobaciones que quiero realizar
        assertEquals(nombre,persona.getNombre());
    }
    @Test
    public void testGetterSeeter(){
        //definicion del objeto
        Persona persona;
        String nombre ="Marcos";
        //Funcionalidad que quierop probar
        persona = new Persona();
        persona.setNombre(nombre);
        //Comprobaciones que quiero realizar
        assertEquals(nombre,persona.getNombre());
    }
    @Test
    public void testToString(){
        //definicion del objeto
        Persona persona;
        //Funcionalidad que quierop probar
        persona = new Persona();
        //Comprobaciones que quiero realizar
        assertEquals("Persona{nombre=}",persona);
    }

}
