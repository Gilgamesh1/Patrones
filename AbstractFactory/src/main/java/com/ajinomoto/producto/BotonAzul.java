package com.ajinomoto.producto;

public class BotonAzul extends Boton{
    public BotonAzul() {
        this.configurar();
    }

    @Override
    public void configurar() {
        System.out.println("Configurando el BOTÓN con borde ROJO");
    }
}
