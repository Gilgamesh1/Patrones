package com.ajinomoto.fabrica;

import com.ajinomoto.producto.Boton;
import com.ajinomoto.producto.Lista;

public class Cliente {
    public Cliente(Componentes style) {
        Boton boton = style.getBoton();
        boton.dibujar();

        Lista lista = style.getLista();
        lista.dibujar();
    }
}
