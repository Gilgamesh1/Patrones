package com.ajinomoto.state2;


public class Semaforo {
    private EstadoSemaforo objEstadoSemaforo;

    public Semaforo() {
        this.objEstadoSemaforo = new EstadoVerde(this);
    }

    public void mostrarAviso() {
        this.objEstadoSemaforo.mostrar();
    }

    public void setEstado(EstadoSemaforo objEstadoSemaforo) {
        this.objEstadoSemaforo = objEstadoSemaforo;
    }
}
