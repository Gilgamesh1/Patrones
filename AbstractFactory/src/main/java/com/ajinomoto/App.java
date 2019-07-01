package com.ajinomoto;

import com.ajinomoto.Fabrica.Cliente;
import com.ajinomoto.Fabrica.ComponentesAzules;
import com.ajinomoto.Fabrica.ComponentesRojos;

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
