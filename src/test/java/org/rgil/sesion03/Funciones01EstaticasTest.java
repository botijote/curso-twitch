package org.rgil.sesion03;

import org.junit.jupiter.api.Test;
//imporart tambien la clase que queremos probar
import static org.rgil.sesion03.Funciones01Estaticas.*;
//importacion para utilizar asset
import static org.junit.jupiter.api.Assertions.assertEquals;


public class Funciones01EstaticasTest {
    //En la misma funcion se pueden crear varias pruebas
    @Test
    public void testSuma() {
        int res = suma(1, 2);
        assertEquals(3, res);
    }

    @Test
    public void testSuma01() {
        int res = suma(1, 256);
        assertEquals(257, res);
    }

    //Funcion que prueba el metodo sumaValores
    @Test
    public void testSunaValores(){
        //Declarar un array
        int[] miArray = {1,2};
        //Llamar a la funcion
        //Recoger el resultado
        int res = sumaValores(miArray);
        //Comprobar que el resultado es correcto
        assertEquals(3,res);
    }

    //Definir una prueba que sea capaz de probar una funcion/metodo que reste dos enteros
    @Test
    public void testResta01() {
    int res = resta(3,2);
    assertEquals(1, res);
    }

    @Test
    public void testMulti(){
        float f = 2.0F;
        float f2 = 3.0F;
        float res = multi (f, f2);
        assertEquals(6.0, res);
    }
}