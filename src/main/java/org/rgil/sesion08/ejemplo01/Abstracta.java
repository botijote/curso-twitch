package org.rgil.sesion08.ejemplo01;

public abstract class Abstracta {

    private String privado;
    public abstract void hazAlgo();

    public String getPrivado() {
        return privado;
    }

    public Abstracta(String privado) {
        this.privado = privado;
    }

    Abstracta(){
        privado = "";
    }

    public void setPrivado(String privado) {
        this.privado = privado;
    }


}
