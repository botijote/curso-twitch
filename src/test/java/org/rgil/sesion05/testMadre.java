package org.rgil.sesion05;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class testMadre {
    @Test
    public void testConstructorSinParametros(){
        //Declarar el objeto de la clase
        Madre madre;
        //Probar la inicializacion
        madre = new Madre();
        //Comprobaciones
        assertEquals("",madre.getNombre());
    }

    @Test
    public void testConstructorConParametros(){
        //Declarar el objeto de la clase
        Madre madre;
        String nombre= "Ines";
        //Probar la inicializacion
        madre = new Madre(nombre);
        //Comprobaciones
        assertEquals(nombre,madre.getNombre());
    }
    @Test
    public void testGetterYSetter(){
        //Declarar el objeto de la clase
        Madre madre;
        String nombre = "Ines";
        //Probar la inicializacion
        madre = new Madre();
        madre.setNombre(nombre);
        //Comprobaciones
        assertEquals(nombre,madre.getNombre());
    }

    @Test
    public void testToString(){
        //Declarar el objeto de la clase
        Madre madre;
        String nombre = "Ines";
        //Probar la inicializacion
        madre = new Madre(nombre);
        //Comprobaciones
        assertEquals("Madre{nombre='Ines'}",madre.toString());
    }
}
