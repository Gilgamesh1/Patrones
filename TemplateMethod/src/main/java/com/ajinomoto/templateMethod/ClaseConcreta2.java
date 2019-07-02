package com.ajinomoto.templateMethod;

public class ClaseConcreta2 extends ClaseAbstracta {
    public ClaseConcreta2() {

    }

    @Override
    protected int multiplicar(int num) {
        return num * 1000;
    }

    @Override
    public int sumar(int num) {
        return num + 100;
    }
}
