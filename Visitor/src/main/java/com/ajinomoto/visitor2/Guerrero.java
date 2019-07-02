package com.ajinomoto.visitor2;

public class Guerrero implements IPersonaje {
    private String arma = "";

    public Guerrero() {
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    @Override
    public void accept(IVisitor visitor) {
        if (visitor.getClass().equals(EquiparArma.class)) {
            visitor.visit(this);
        }
    }
}
