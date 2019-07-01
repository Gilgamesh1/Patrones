package com.ajinomoto.Producto;

public class ListaAzul extends Lista {
    public ListaAzul() {
        this.configurar();
    }

    @Override
    public void configurar() {
        System.out.println("Configurando la LISTA con borde AZUL");
    }
}
