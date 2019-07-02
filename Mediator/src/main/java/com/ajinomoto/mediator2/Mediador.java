package com.ajinomoto.mediator2;

public class Mediador {
    private BotonHola hola;
    private BotonAdios adios;
    private BotonBorrar borrar;
    private CuadroTexto texto;

    public Mediador(BotonHola hola, BotonAdios adios, BotonBorrar borrar, CuadroTexto texto) {
        this.hola = hola;
        this.adios = adios;
        this.borrar = borrar;
        this.texto = texto;
    }

    public void clicHola() {
        this.texto.setTexto("Hola");
    }

    public void clicAdios() {
        this.texto.setTexto("Adios");
    }

    public void clicBorrar() {
        this.texto.setTexto(null);
    }
}
