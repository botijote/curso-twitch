package org.rgil.sesion12;

public class Gato extends Animal{

    private String nombre;


    Gato(){
        super();
        this.nombre= "";
    }
    Gato(int edad, String nombre){
        super(edad);
        this.nombre= nombre;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "edad= " + this.getEdad() +
                " nombre='" + nombre + '\'' +
                '}';
    }
}
