package com.ajinomoto.mediator2;

public class BotonHola extends Componente {
    public BotonHola() {
    }

    public void clicHola(){
        this.getMediador().clicHola();
    }
}
