package org.rgil.sesion13.hilos.complejo;

public class HilosContenedor {

    private int dato;

    private boolean hayDato = false;

    public synchronized int get(){
        while (hayDato  == false) {
            try {
                //espera a que el productor coloque un valor
                wait();
            } catch (InterruptedException e) {}
        }
            hayDato = false;
            //notifica que le valor ha sido consumido
            notifyAll();
            return dato;
        }

        public synchronized void put(int valor){
            while (hayDato  == true) {
                try {
                    //espera a que a que se consuma el dato
                    wait();
                } catch (InterruptedException e) {}
            }
            dato = valor;
            hayDato = true;
            //notifica que ya hay dato
            notifyAll();

        }


}
