package org.rgil.sesion11;

import java.util.*;

public class EjercicioColecciones {
    public static void main(String[] args) {
        System.out.println("Ejercicios resueltos de colecciones");
        List<String> listado = new LinkedList<>();
        listado.add("Marcos");
        listado.add("Ines");
        System.out.println(listado.get(0));
        System.out.println("Recorrer el listado");
        for (String s:listado) {
            System.out.println(s);
        }
        listado.remove(1);
        System.out.println("Listado " + listado);

        Set<Integer> numeros = new HashSet<>();
        numeros.add(23);
        numeros.add(999);
        for (Integer i:numeros) {
            System.out.println(i);
        }
        System.out.println("Set " + numeros);

        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Amarillo");
        mapa.put(0, " rojo");
        System.out.println("Mapa " + mapa.get(0));
        //recorrer mapa
        Set<Integer> claves = mapa.keySet();
        System.out.println("Recorrer un mapa");
        for (Integer i:claves) {
            System.out.println("Clave: "+ i + " ,valor asociado: " +mapa.get(i));
        }
        System.out.println("Mapa" + mapa);

        Serie serie = new Serie("asde123","Friends", "comedia", 1992);


        Actor actor= new Actor("Stallone", 20, "accion");
        Actor actor1= new Actor(" Santiago Segura", 15, "comedia");

        serie.getReparto().add(actor1);
        serie.getReparto().add(actor);

        for (Actor a:serie.getReparto()) {
            System.out.println(a);
        }
    }
}
