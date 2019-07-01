package com.ajinomoto.Fabrica;

import com.ajinomoto.Producto.Boton;
import com.ajinomoto.Producto.Lista;

public interface Componentes {
    public abstract Boton getBoton();

    public abstract Lista getLista();
}
