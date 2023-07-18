package org.rgil.sesion07;

import java.util.Objects;

public class Jefe extends Empleado{

    public String departamento;

    public Jefe() {
        super();
        this.departamento ="";
    }

    public Jefe(String nombre, String dni, String tlf, double sueldo, String cargo, String departamento) {
        super(nombre, dni, tlf, sueldo, cargo);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jefe jefe = (Jefe) o;
        return Objects.equals(departamento, jefe.departamento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departamento);
    }

    @Override
    public String toString() {
        return "Jefe{" +
                "departamento='" + departamento + '\'' +
                '}';


    }

}
