package com.ajinomoto.observer2;

public class UnObservador implements IObservador {
    public UnObservador() {
    }

    @Override
    public void observadoActualizado(Observado observado, Object valor) {
        System.out.println("El valor del objeto ha cambiado a [" + ((String) valor) + "]");
    }
}
