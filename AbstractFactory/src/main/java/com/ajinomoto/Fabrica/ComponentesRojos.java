package com.ajinomoto.Fabrica;

import com.ajinomoto.Producto.Boton;
import com.ajinomoto.Producto.BotonRojo;
import com.ajinomoto.Producto.Lista;
import com.ajinomoto.Producto.ListaRoja;

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
