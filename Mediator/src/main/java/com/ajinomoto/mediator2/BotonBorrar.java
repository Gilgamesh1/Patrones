package com.ajinomoto.mediator2;

public class BotonBorrar extends Componente {
    public BotonBorrar() {
    }

    public void clicBorrar() {
        this.getMediador().clicBorrar();
    }
}
