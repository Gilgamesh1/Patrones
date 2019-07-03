package com.ajinomoto.mediator2;

public class CuadroTexto extends Componente {
    public CuadroTexto() {
    }

    public void setTexto(String texto) {
        if (texto == null) {
            System.out.println("El cuadro de texto está vacío");
        } else {
            System.out.println(texto);
        }
    }
}
