package com.ajinomoto.mediator2;

public class Componente {
    protected Mediador m;

    public Componente() {
    }

    public Mediador getMediador() {
        return m;
    }

    public void setMediador(Mediador m) {
        this.m = m;
    }
}
