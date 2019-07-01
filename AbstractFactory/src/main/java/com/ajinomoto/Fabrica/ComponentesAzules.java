package com.ajinomoto.Fabrica;

import com.ajinomoto.Producto.Boton;
import com.ajinomoto.Producto.BotonAzul;
import com.ajinomoto.Producto.Lista;
import com.ajinomoto.Producto.ListaAzul;

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
