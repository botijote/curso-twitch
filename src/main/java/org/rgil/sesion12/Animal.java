package org.rgil.sesion12;

import lombok.Data;

@Data
public class Animal {

    private int edad;
    public Animal() {
        this.edad = 0;
    }
    public Animal(int edad) {
        this.edad = edad;
    }


}
