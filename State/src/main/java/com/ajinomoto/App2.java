package com.ajinomoto;

import com.ajinomoto.state2.EstadoNaranja;
import com.ajinomoto.state2.EstadoRojo;
import com.ajinomoto.state2.Semaforo;

public class App2 {

    public static void main(String[] args) {
        Semaforo objSemaforo = new Semaforo();
        // Muestra el aviso por defecto (verde, no hay alerta)
        objSemaforo.mostrarAviso();
        objSemaforo.setEstado(new EstadoNaranja(objSemaforo));
        objSemaforo.mostrarAviso();
        objSemaforo.setEstado(new EstadoRojo(objSemaforo));
        objSemaforo.mostrarAviso();
    }
}
