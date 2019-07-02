package com.ajinomoto;

import com.ajinomoto.mediator2.*;

public class App2 {
    public static void main(String[] args) {
        // Crear los objetos que participarán en la comunicación
        BotonHola hola = new BotonHola();
        BotonAdios adios = new BotonAdios();
        BotonBorrar borrar = new BotonBorrar();
        CuadroTexto texto = new CuadroTexto();
        // Crear el objeto mediador de la comunicación y agregarle los otros objetos
        Mediador m = new Mediador(hola, adios, borrar, texto);
        // Definir en cada objeto el mediador usado en la comunicación
        hola.setMediador(m);
        adios.setMediador(m);
        borrar.setMediador(m);
        texto.setMediador(m);
        // Provocar clics en los botones
        hola.clicHola();
        adios.clicAdios();
        borrar.clicBorrar();
        hola.clicHola();
    }
}
