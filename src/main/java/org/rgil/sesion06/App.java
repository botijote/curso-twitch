package org.rgil.sesion06;

public class App {
    public static void main(String[] args) {
        System.out.println("Sesion06");
        Persona persona = new Persona();
        System.out.println(persona);
        Empleado empleado = new Empleado();
        System.out.println(empleado);

        empleado.setNombre("Marcos");
        System.out.println(empleado.getNombre());

        empleado = new Empleado("Marco", 35000.0);
        System.out.println(empleado);
        empleado.setSueldo(75000.0);
        System.out.println(empleado.getSueldo());
    }
}
