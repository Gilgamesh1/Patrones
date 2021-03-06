package com.ajinomoto.x2;

public class ManejadorRangoPositivo extends Manejador {
    public ManejadorRangoPositivo() {
    }

    // --------------------------------------------------
    @Override
    public void comprobar(int numero) {
        if (numero > 0 && numero <= 50) {
            System.out.println("El número está entre 1 y 50");
        }
        if (this.getSiguiente() != null) {
            this.getSiguiente().comprobar(numero);
        }
    }
}
