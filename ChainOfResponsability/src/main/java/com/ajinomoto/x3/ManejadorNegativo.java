package com.ajinomoto.x3;

public class ManejadorNegativo extends Manejador {
    public ManejadorNegativo() {
    }

    // --------------------------------------------------
    @Override
    public void comprobar(int numero) {
        if (numero < 0) {
            System.out.println("El número es negativo");
        }
    }
}
