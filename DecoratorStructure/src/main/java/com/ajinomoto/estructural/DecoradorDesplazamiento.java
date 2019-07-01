package com.ajinomoto.estructural;

public abstract class DecoradorDesplazamiento implements IVentana {
    protected IVentana v;

    public IVentana getVentana() {
        return v;
    }

    public void setVentana(IVentana v) {
        this.v = v;
    }

    public DecoradorDesplazamiento(IVentana v) {
        this.setVentana(v);
    }

    @Override
    public void dibujar(int columna, int fila) {
        this.getVentana().dibujar(columna, fila);
    }
}
