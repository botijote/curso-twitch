package org.rgil.sesion11;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Serie implements Serializable {
    private String serialUID = "";
    private String titulo;
    private String genero;
    private int annoPublicacion;

    private List<Actor> reparto =  new ArrayList<>();

    public Serie() {
        this.titulo = "";
        this.genero = "";
        this.annoPublicacion = 0;
        //this.reparto= new ArrayList<>();
    }

    public Serie(String serialUID, String titulo, String genero, int annoPublicacion ) {
        this.titulo = titulo;
        this.genero = genero;
        this.annoPublicacion = annoPublicacion;
        this.serialUID= serialUID;

    }

    public String getSerialUID() {
        return serialUID;
    }

    public void setSerialUID(String serialUID) {
        this.serialUID = serialUID;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnnoPublicacion() {
        return annoPublicacion;
    }

    public void setAnnoPublicacion(int annoPublicacion) {
        this.annoPublicacion = annoPublicacion;
    }

    public List<Actor> getReparto() {
        return reparto;
    }

    public void setReparto(List<Actor> reparto) {
        this.reparto = reparto;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "serialUID='" + serialUID + '\'' +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", annoPublicacion=" + annoPublicacion +
                ", reparto=" + reparto +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return annoPublicacion == serie.annoPublicacion && Objects.equals(serialUID, serie.serialUID) && Objects.equals(titulo, serie.titulo) && Objects.equals(genero, serie.genero) && Objects.equals(reparto, serie.reparto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialUID, titulo, genero, annoPublicacion, reparto);
    }
}
