package org.rgil.sesion12;

public class Imprime <Tipo>{

    private Tipo objeto;

    Imprime(Tipo objeto){
        this.objeto = objeto;
    }

    public void Imprime(){
        System.out.println(this.objeto);
    }
}
