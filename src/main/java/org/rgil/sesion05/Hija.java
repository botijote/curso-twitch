package org.rgil.sesion05;

public class Hija extends Madre{
    private String tlf;

    public Hija(){
        super();
        this.tlf= "";

    }

    public Hija(String nombre, String tlf){
        super(nombre);
        this.tlf =tlf;
    }
    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    @Override
    public String toString() {
        return "Hija{" +
                this.getNombre()+", "+
                "tlf='" + tlf + '\'' +
                '}';
    }
}
