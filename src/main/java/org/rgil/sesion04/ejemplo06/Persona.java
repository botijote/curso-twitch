package org.rgil.sesion04.ejemplo06;

import java.util.Objects;

public class Persona {
    public String nombre;
    public String tlf, direccion;
    private int edad;
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

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", tlf='" + tlf + '\'' +
                ", direccion='" + direccion + '\'' +
                ", edad=" + edad +
                '}';
    }

    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad){
        this.edad= edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return edad == persona.edad && Objects.equals(nombre, persona.nombre) && Objects.equals(tlf, persona.tlf) && Objects.equals(direccion, persona.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, tlf, direccion, edad);
    }
}
