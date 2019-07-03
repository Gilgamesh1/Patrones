package com.ajinomoto.x2;

public class ManejadorPositivo extends Manejador {
    public ManejadorPositivo() {
    }

    // --------------------------------------------------
    @Override
    public void comprobar(int numero) {
        if (numero > 0) {
            System.out.println("El número es positivo");
        }
        if (this.getSiguiente() != null) {
            this.getSiguiente().comprobar(numero);
        }
    }
}
