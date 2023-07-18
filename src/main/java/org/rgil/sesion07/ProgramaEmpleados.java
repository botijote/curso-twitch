package org.rgil.sesion07;

public class ProgramaEmpleados {
    public static void main(String[] args) {
        Empleado empleado =new Empleado();
        System.out.println(empleado);

        Empleado empleado1= new Empleado("Marcos", "675120 ", "+34 425", 30000.0,"Director");
        System.out.println(empleado1);
        empleado.setNombre("Ines");
        System.out.println(empleado.getNombre());
        empleado.setDni("23451");
        System.out.println(empleado.getDni());
        empleado.setTlf("+34 3424");
        System.out.println(empleado.getTlf());
        empleado.setSueldo(45000.0);
        System.out.println(empleado.getSueldo());
        empleado.setCargo("Director");
        System.out.println(empleado.getCargo());
        System.out.println(empleado);


        Currito currito= new Currito();
        System.out.println(currito);
        currito.setMarrones(3);
        System.out.println(currito.getMarrones());
        currito.setNombre("Perico");
        System.out.println(currito.getNombre());

        Jefe jefe= new Jefe();
        System.out.println(jefe);
        jefe.setDepartamento("Auditoria");
        System.out.println(jefe.getDepartamento());
        jefe.setNombre("Eufrassio");
        System.out.println(jefe.getNombre());

        System.out.println("El nombre del empleado es "+ empleado.getNombre());

        System.out.println(jefe.getSueldo());
        jefe.setSueldo(56000.0);
        System.out.println(jefe.getSueldo());

    }
}
