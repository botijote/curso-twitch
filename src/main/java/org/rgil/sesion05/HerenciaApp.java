package org.rgil.sesion05;

public class HerenciaApp {
    public static void main(String[] args) {
        Madre madre = new Madre();
        System.out.println(madre);
        madre.setNombre("Carla");
        System.out.println(madre.getNombre());
        System.out.println(madre);

        Hija hija = new Hija();
        System.out.println(hija);
        hija.setNombre("Ines");
        System.out.println(hija.getNombre());
        System.out.println(hija);

        //usar los getter y seter propios de hija
        hija.setTlf("+34 352");;
        System.out.println(hija.getTlf());
        System.out.println(hija);

        hija = new Hija("Perica", "+ 34 870");
        System.out.println(hija);
    }
}
