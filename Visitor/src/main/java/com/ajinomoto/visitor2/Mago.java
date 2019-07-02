package com.ajinomoto.visitor2;

public class Mago implements IPersonaje {

    private int nivelMagia = 1;
    private String arma = "";
    private String conjuro = "";

    public Mago() {
    }

    public int getNivelMagia() {
        return nivelMagia;
    }

    public void setNivelMagia(int nivelMagia) {
        this.nivelMagia = nivelMagia;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public String getConjuro() {
        return conjuro;
    }

    public void setConjuro(String conjuro) {
        this.conjuro = conjuro;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
