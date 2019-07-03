package com.ajinomoto;

import com.ajinomoto.memento2.GestorMarcadores;
import com.ajinomoto.memento2.Libro;

public class App2 {
    public static void main(String[] args) {
        GestorMarcadores objGestorMarcadores = new GestorMarcadores();
        // Abrimos el libro y vamos a la página 10
        Libro libro = new Libro();
        libro.irPagina(10);
        // Guardamos la página en marcadores
        objGestorMarcadores.addPosicionMarcador(libro.guardarMarcador());
        // Saltamos a la página 83
        libro.irPagina(83);
        // Guardamos la página en marcadores
        objGestorMarcadores.addPosicionMarcador(libro.guardarMarcador());
        // Volvemos a la primera página guardada en marcadores
        libro.recuperarPagina(objGestorMarcadores.getPosicionMarcador(0));
        // Saltamos a la segunda página guardada en marcadores
        libro.recuperarPagina(objGestorMarcadores.getPosicionMarcador(1));

    }
}
