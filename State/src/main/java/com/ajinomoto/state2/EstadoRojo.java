package com.ajinomoto.state2;

public class EstadoRojo extends EstadoSemaforo {
    public EstadoRojo(Semaforo objSemaforo) {
        this.objSemaforo = objSemaforo;
    }

    @Override
    public void mostrar() {
        System.out.println("Alerta roja");
    }
}
