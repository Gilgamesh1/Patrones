package com.ajinomoto.memento2;

import java.util.ArrayList;

public class GestorMarcadores {
    private ArrayList<Memento> marcadores = new ArrayList<>();

    public void addPosicionMarcador(Memento m) {
        marcadores.add(m);
    }

    public Memento getPosicionMarcador(int indice) {
        return marcadores.get(indice);
    }
}
