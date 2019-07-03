package com.ajinomoto;

import com.ajinomoto.x3.Manejador;
import com.ajinomoto.x3.ManejadorNegativo;
import com.ajinomoto.x3.ManejadorPositivo;
import com.ajinomoto.x3.ManejadorRangoPositivo;

public class App3 {
    public static void main(String[] args) {
        Manejador m1 = new ManejadorPositivo();
        Manejador m2 = new ManejadorNegativo();
        Manejador m3 = new ManejadorRangoPositivo();
        m1.setSiguiente(m2);
        m2.setSiguiente(m3);
        m1.procesar(60);
        m1.procesar(-30);
        m1.procesar(40);
    }
}
