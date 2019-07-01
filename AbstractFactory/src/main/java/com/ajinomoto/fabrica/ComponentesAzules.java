package com.ajinomoto.fabrica;

import com.ajinomoto.producto.Boton;
import com.ajinomoto.producto.BotonAzul;
import com.ajinomoto.producto.Lista;
import com.ajinomoto.producto.ListaAzul;

public class ComponentesAzules implements Componentes {
    public ComponentesAzules() {
    }

    @Override
    public Boton getBoton() {
        return new BotonAzul();
    }

    @Override
    public Lista getLista() {
        return new ListaAzul();
    }
}
