package com.ajinomoto.state;

public class EstadoNaranja  extends EstadoSemaforo{
    public EstadoNaranja(){}
    @Override
    public void mostrar() {
        System.out.println("Luz naranja");
    }
}
