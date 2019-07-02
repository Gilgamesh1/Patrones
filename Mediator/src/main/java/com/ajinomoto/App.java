package com.ajinomoto;

import com.ajinomoto.mediator.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        // Crear el objeto centralizador de la comunicación
        Mediador m = new Mediador();
        // Crear los objetos que participarán en la comunicación
        Colega cc1 = new ColegaConcreto1(m);
        Colega cc2 = new ColegaConcreto2(m);
        Colega cc3 = new ColegaConcreto3(m);
        // Agregarlos al objeto centralizador
        m.agregarColega(cc1);
        m.agregarColega(cc2);
        m.agregarColega(cc3);
        // Provocar un cambio en un uno de los elementos
        cc2.comunicar("ColegaConcreto2 ha cambiado!");
    }
}
