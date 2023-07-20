package org.rgil.sesion13.hilos;

public class MiHiloApp {
    public static void main(String[] args) {
         MiHilo miHilo= new MiHilo("hilo1");
         MiHilo miHilo1= new MiHilo("hilo2");
         //Lanzamos el hilo
         miHilo.start();
         miHilo1.start();
    }
}
