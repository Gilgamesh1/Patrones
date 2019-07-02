package com.ajinomoto.observer3;

public class UnObservado extends Observado {
    private int numero = 0;

    public UnObservado() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
        // Según nuestro ejemplo, cada vez que se agregue un nuevo observador, los existentes serán notificados
        notificarObservadores();
    }
}
