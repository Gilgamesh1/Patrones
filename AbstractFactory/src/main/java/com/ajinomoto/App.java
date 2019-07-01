package com.ajinomoto;

import com.ajinomoto.fabrica.Cliente;
import com.ajinomoto.fabrica.ComponentesAzules;
import com.ajinomoto.fabrica.ComponentesRojos;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Se insertarán los componentes con el borde azul
        Cliente cliente = new Cliente(new ComponentesAzules());
        System.out.println("----------------------------");
        // Ahora se insertarán los componentes con el borde rojo
        cliente = new Cliente(new ComponentesRojos());
    }
}
