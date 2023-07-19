package org.rgil.sesion08.ejemplo02;

public class ConsultableApp {
    public static void main(String[] args) {
        //Seleccionar la clase que quieres usar como implementacion del interfaz
        String clase = "Memoria";
//Declarqcion del objeto en base as u interfaz
        Consultable consultable ;

        switch (clase){
            case "Memoria" ->{
                consultable = new ConsutableBBDD();
            }

            default -> {
               consultable = new ConsultableMemoria();
            }
        }

        //Uso de los metodos de la interfaz
        System.out.println(consultable.findAll().toString());
        Usuario usuario = new Usuario(0, "Marcos", "1234");
        System.out.println(consultable.save(usuario));
        System.out.println(consultable.findByID(0));

        usuario.setUsername("Ines");
        usuario.setPassword("1234");
        System.out.println(consultable.update(0, usuario));

        System.out.println(consultable.delete(0));


    }

}
