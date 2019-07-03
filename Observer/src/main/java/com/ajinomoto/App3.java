package com.ajinomoto;

import com.ajinomoto.observer3.*;

public class App3 {
    public static void main(String[] args) {
        // Instanciar el objeto que será Observado
        UnObservado objObservado = new UnObservado();
        // Instanciar los observadores, pasándoles como parámetro el que será Observado
        new UnObservador(objObservado);
        new UnObservador(objObservado);
        new UnObservador(objObservado);
        objObservado.setNumero(55);
    }
}
