package org.rgil.sesion14;

import java.io.File;
import java.io.IOException;

public class FicherosApp {
    public static void main(String[] args) {
        System.out.println("Ejemplo de Ficheros");
       // Clase File permite definir una ruta qie queremos gestionar
        File file = null;
        try{
            //Construimos el objeto de la Clase File para indicar esa ruta
            file = new File("./md5sum.txt");
            if (file.createNewFile()) {
                System.out.println("Archivo creado");
            }else {
                System.out.println("El archivo ya existe");
            }
        }catch (IOException ioe){
            ioe.printStackTrace();
            System.out.println(ioe.getMessage());
        }
    }
}
