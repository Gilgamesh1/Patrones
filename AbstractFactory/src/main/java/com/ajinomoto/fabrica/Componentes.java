package com.ajinomoto.fabrica;

import com.ajinomoto.producto.Boton;
import com.ajinomoto.producto.Lista;

public interface Componentes {
    public abstract Boton getBoton();

    public abstract Lista getLista();
}
