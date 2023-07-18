package org.rgil.sesion07;

import java.util.Objects;

public class Empleado extends Persona{

    private String dni;
    private String tlf;
    private double sueldo;
    private String cargo;

    public Empleado() {
        super();
        this.dni = "";
        this.tlf = "";
        this.sueldo = 0.0;
        this.cargo = "";
    }

    public Empleado(String nombre, String dni, String tlf, double sueldo, String cargo) {
        super(nombre);
        this.dni = dni;
        this.tlf = tlf;
        this.sueldo = sueldo;
        this.cargo = cargo;
    }

       public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "dni='" + dni + '\'' +
                ", tlf='" + tlf + '\'' +
                ", sueldo=" + sueldo +
                ", cargo='" + cargo + '\'' +
               ", nombre='" + getNombre() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Double.compare(empleado.sueldo, sueldo) == 0 && Objects.equals(dni, empleado.dni) && Objects.equals(tlf, empleado.tlf) && Objects.equals(cargo, empleado.cargo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni, tlf, sueldo, cargo);
    }
}
