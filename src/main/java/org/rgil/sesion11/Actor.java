package org.rgil.sesion11;

import java.io.Serializable;
import java.util.Objects;

public class Actor implements Serializable {

    private String nombre;
    private int experiencia;
    private String generoFav;

    public Actor() {
        this.nombre = "";
        this.experiencia = 0;
        this.generoFav = "";
    }

    public Actor(String nombre, int experiencia, String generoFav) {
        this.nombre = nombre;
        this.experiencia = experiencia;
        this.generoFav = generoFav;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public String getGeneroFav() {
        return generoFav;
    }

    public void setGeneroFav(String generoFav) {
        this.generoFav = generoFav;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "nombre='" + nombre + '\'' +
                ", experiencia=" + experiencia +
                ", generoFav='" + generoFav + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return experiencia == actor.experiencia && Objects.equals(nombre, actor.nombre) && Objects.equals(generoFav, actor.generoFav);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, experiencia, generoFav);
    }
}
