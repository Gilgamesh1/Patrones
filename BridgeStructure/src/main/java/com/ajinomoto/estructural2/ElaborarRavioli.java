package com.ajinomoto.estructural2;

public class ElaborarRavioli extends ElaborarPasta {
    public ElaborarRavioli(IElaborar implementador) {
        this.setImplementador(implementador);
    }

    @Override
    public void obtener() {
        System.out.println("Preparando raviolis...");
        this.getImplementador().procesar();
    }
}
