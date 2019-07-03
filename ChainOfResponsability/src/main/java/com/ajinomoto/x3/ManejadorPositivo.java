package com.ajinomoto.x3;

public class ManejadorPositivo extends Manejador {
    public ManejadorPositivo() {
    }

    // --------------------------------------------------
    @Override
    public void comprobar(int numero) {
        if (numero > 0) {
            System.out.println("El número es positivo");
        }
    }
}
