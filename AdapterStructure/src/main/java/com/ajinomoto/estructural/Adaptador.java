package com.ajinomoto.estructural;

public class Adaptador implements IAdaptador {
    private CajaEuros cajaEuros = new CajaEuros();

    public Adaptador() {
    }

    public double getSaldo() {
        return this.cajaEuros.getTotalEuros();
    }

    @Override
    public void sacarPesetas(double pesetas) {
        double euros = pesetas / 166.386;
        cajaEuros.sacarEuros(euros);
    }

    @Override
    public void ingresarPesetas(double pesetas) {
        double euros = pesetas / 166.386;
        cajaEuros.ingresarEuros(euros);
    }
}
