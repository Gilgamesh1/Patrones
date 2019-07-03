package com.ajinomoto.templateMethod;

public class ClaseConcreta1 extends ClaseAbstracta {
    public ClaseConcreta1() {
    }

    @Override
    protected int multiplicar(int num) {
        return num * 100;
    }

    @Override
    public int sumar(int num) {
        return num + 10;
    }
}
