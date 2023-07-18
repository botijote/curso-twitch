package org.rgil.sesion07;

import java.util.Objects;

public class Currito extends Empleado{
    public int marrones;

    public Currito() {
        super();
        this.marrones = 0;
    }

    public Currito(String nombre, String dni, String tlf, double sueldo, String cargo, int marrones) {
        super(nombre, dni, tlf, sueldo, cargo);
        this.marrones = marrones;
    }

    public int getMarrones() {
        return marrones;
    }

    public void setMarrones(int marrones) {
        this.marrones = marrones;
    }

    @Override
    public String toString() {
        return "Currito{" +
                "marrones=" + marrones +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Currito currito = (Currito) o;
        return marrones == currito.marrones;
    }

    @Override
    public int hashCode() {
        return Objects.hash(marrones);
    }
}
