package com.ajinomoto.strategy;

public class Restar implements IAritmetica {
    public Restar() {
    }

    @Override
    public int realizarOperacion(int a, int b) {
        return a - b;
    }
}
