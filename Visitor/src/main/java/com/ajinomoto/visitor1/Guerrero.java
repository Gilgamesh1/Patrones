package com.ajinomoto.visitor1;

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
        visitor.visit(this);
    }
}
