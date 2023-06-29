package org.rgil.sesion04.ejemplo04;

public class Persona {
    public String nombre;
    public String tlf, direccion;
    public int edad;
    public Persona(){
        this.nombre="";
        this.tlf="";
        this.direccion="";
        this.edad= 0;
    }

    //Funcion constructora con parametros
    public Persona(String nombre, String tlf, String direccion, int edad) {
        this.nombre=nombre;
        this.tlf=tlf;
        this.direccion=direccion;
        this.edad= edad;
    }
}
