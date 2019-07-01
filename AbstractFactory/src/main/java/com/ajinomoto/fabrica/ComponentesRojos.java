package com.ajinomoto.fabrica;

import com.ajinomoto.producto.Boton;
import com.ajinomoto.producto.BotonRojo;
import com.ajinomoto.producto.Lista;
import com.ajinomoto.producto.ListaRoja;

public class ComponentesRojos implements Componentes {
    public ComponentesRojos() {
    }

    @Override
    public Boton getBoton() {
        return new BotonRojo();
    }

    @Override
    public Lista getLista() {
        return new ListaRoja();
    }
}
