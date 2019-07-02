package com.ajinomoto.templateMethod;

public class ClaseConcreta3 extends ClaseAbstracta {
    public ClaseConcreta3() {
    }

    @Override
    public void mensaje() {
        // Procesamos código extra
        System.out.println("En ClaseConcreta3");
        // Llamamos al código del método implementado en la clase abstracta
        super.mensaje();
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
