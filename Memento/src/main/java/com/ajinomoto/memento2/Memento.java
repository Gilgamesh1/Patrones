package com.ajinomoto.memento2;

public class Memento {
    private int estado;

    public Memento(int estado) {
        this.estado = estado;
    }

    public int getMarcadorPagina() {
        return this.estado;
    }

    public void setMarcadorPagina(int estado) {
        this.estado = estado;
    }
}
