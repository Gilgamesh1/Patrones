package com.ajinomoto.x2;

public class ManejadorNegativo extends Manejador {
    public ManejadorNegativo() {
    }

    // --------------------------------------------------
    @Override
    public void comprobar(int numero) {
        if (numero < 0) {
            System.out.println("El número es negativo");
        }
        if (this.getSiguiente() != null) {
            this.getSiguiente().comprobar(numero);
        }
    }
}
