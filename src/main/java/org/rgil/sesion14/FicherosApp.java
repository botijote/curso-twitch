package org.rgil.sesion14;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FicherosApp {
    public static void main(String[] args) {
        System.out.println("Ejemplo de Ficheros");
       // Clase File permite definir una ruta qie queremos gestionar
        File file = null;
        try{
            //Construimos el objeto de la Clase File para indicar esa ruta
            //Este archivo se crea dentro de la carpeta principal del proyecto
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

        // Instrucciones para escribir en el fichero
        BufferedWriter out = null;
        try {
            //Intento de escritura en el fichero
            FileWriter fileWriter = new FileWriter("./md5sum.txt");
            out = new BufferedWriter(fileWriter);
            //Escribimos lo que queremos guardar
            out.write("aString");
            out.close();
            System.out.println("Archivo creado con exito");
        }catch (IOException e){
            System.out.println("Fallo al escribir el fichero");
            System.out.println(e.getMessage());
        }// Se ejecuta siempre, haya pasado o no por el catch
        finally {
            System.out.println("Ejecutado en ambos casos try completo o catch");
        }


    }
}
