package com.ajinomoto;

import com.ajinomoto.state.EstadoNaranja;
import com.ajinomoto.state.EstadoRojo;
import com.ajinomoto.state.Semaforo;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Semaforo objSemaforo = new Semaforo();
        // Muestra el aviso por defecto (verde, no hay alerta)
        objSemaforo.mostrar();
        objSemaforo.setEstado(new EstadoNaranja());
        objSemaforo.mostrar();
        objSemaforo.setEstado(new EstadoRojo());
        objSemaforo.mostrar();
    }
}
