package com.ajinomoto.Fabrica;

import com.ajinomoto.Producto.Boton;
import com.ajinomoto.Producto.Lista;

public class Cliente {
    public Cliente(Componentes style) {
        Boton boton = style.getBoton();
        boton.dibujar();

        Lista lista = style.getLista();
        lista.dibujar();
    }
}
