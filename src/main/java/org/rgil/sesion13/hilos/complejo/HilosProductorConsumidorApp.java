package org.rgil.sesion13.hilos.complejo;

public class HilosProductorConsumidorApp {
    public static void main(String[] args) {
        HilosContenedor c= new HilosContenedor();
        HilosProductor produce = new HilosProductor(c);
        HilosConsumidor consume = new HilosConsumidor(c);
        produce.start();
        consume.start();
        }

}
