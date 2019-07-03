package com.ajinomoto.visitor1;

public class Mago implements IPersonaje {
    private String arma = "";

    public Mago() {
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
