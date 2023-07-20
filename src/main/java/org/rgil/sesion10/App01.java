package org.rgil.sesion10;

import java.util.*;

public class App01 {
    public static void main(String[] args) {
        //Uso y manejo de colecciones en Java

        //Definicion e inicializacion de una lista
        System.out.println("Ejemplos de list generico");
        //ArrayList maneja los listados como arrays
        List<Object> listado = new ArrayList<Object>();
        //Insertar un objeto al listado
        int entero= 12;
        listado.add(entero);
        System.out.println(listado);

        int otroEntero =1;
        listado.add(otroEntero);
        System.out.println(listado);

        String nombre = "Marcos";
        listado.add(nombre);
        System.out.println(listado);

        boolean booleano = true;
        listado.add(booleano);
        System.out.println(listado);

        //Devolver un elemento del indice
        System.out.println(listado.get(0));

        //Cuantos elementos hay en el listado
        System.out.println("Numero de elementos = "  +listado.size());

        //Borrar valores
        listado.remove(0);
        System.out.println("Numero de elementos = "  +listado.size());
        System.out.println(listado);

        //Sustituir un elemento por otro
        System.out.println(listado.get(0));
            //se pasa el indice deñ valor que queremos sustituir y
            // el nuevo valor que queremos introducri
        listado.set(0,2);
        System.out.println(listado);

       //Se puede especificar el tipo que contenga el listado
        System.out.println("Ejemplos de List");
        // Usamos LinkedList se usa cuando el listado de datos va a ser muy variable en su contenido
        List<String> familiares = new LinkedList<>();
        //añadir un elemento al listado
        String madre= "Ines";
        familiares.add(madre);
        System.out.println(familiares);
        familiares.add("Marcos");
        System.out.println(familiares);

        //Set
        System.out.println("Ejemplos de set");
        //Conjunto ordenado de elementos
        //Tipo HashSet
        Set<String> conjunto = new HashSet<>();
            //añadir un elemento al Set
        conjunto.add("Roberto");
        System.out.println(conjunto);
        //numero de elementos del Set
        System.out.println(conjunto.size());
        //borrar un elemento
        conjunto.remove("Roberto");
        System.out.println(conjunto);
        conjunto.add("Roberto");
        //para saber si el set contiene un elemento
        System.out.println(conjunto.contains("Roberto"));

        //Map
        System.out.println("Ejemplos de mapa");
        // hay que definir el tipo del indice que va a manejar y el tipo de datos que vamos a almacenar
        Map<Integer, String> mapa = new HashMap<>();
        //El indice se ordena de mayor a menor y en orden alfabetico
        mapa.put(1, "Marcos");
        mapa.put(0,"Ines");
        System.out.println(mapa);

        Map<String,String> mapaCliente = new HashMap<>();
        mapaCliente.put("nombre", "Roberto");
        mapaCliente.put("direccion", "Arroyo");
        mapaCliente.put("tlf", "+34 674");
        System.out.println(mapaCliente);
        //Acceso al valor mediante la clave
        System.out.println(mapaCliente.get("tlf"));
        //borrar elementos
        //hay dos formas, todos los que pertenecen a un indice o
        //indicando el elemento que queremos mediante indice y valor
        mapaCliente.remove("tlf");
        System.out.println(mapaCliente);



    }
}
