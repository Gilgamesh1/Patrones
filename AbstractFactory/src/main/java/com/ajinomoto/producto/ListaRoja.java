package com.ajinomoto.producto;

public class ListaRoja extends Lista {
    public ListaRoja() {
        this.configurar();
    }

    @Override
    public void configurar() {
        System.out.println("Configurando la LISTA con borde ROJO");
    }
}
