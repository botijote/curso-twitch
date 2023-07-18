package org.rgil.sesion08.ejemplo01;

public class HerenciaAbstracta extends Abstracta{

    public HerenciaAbstracta(String privado) {
        super(privado);
    }

    public HerenciaAbstracta() {
        super();
    }

    @Override
    public void hazAlgo() {
        System.out.println("Decir algo");
    }

    @Override
    public String toString() {
        return "HerenciaAbstracta{private='"+ getPrivado()+"'}";
    }
}
