package com.ajinomoto.Producto;

public class BotonRojo extends Boton {
    public BotonRojo() {
        this.configurar();
    }

    @Override
    public void configurar() {
        System.out.println("Configurando el BOTÓN con borde ROJO");
    }
}
