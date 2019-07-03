package com.ajinomoto.observer2;

import java.util.ArrayList;

public abstract class Observado {
    private ArrayList<IObservador> observadores = new ArrayList<>();

    public Observado() {
    }

    public void agregarObservador(IObservador o) {
        observadores.add(o);
    }

    public void eliminarObservador(IObservador o) {
        observadores.remove(o);
    }

    public void notificarObservadores(Object valor) {
        // Enviarles la notificación a cada observador a través de su propio método
        for (IObservador obj : observadores) {
            obj.observadoActualizado(this, valor);
        }
    }
}
