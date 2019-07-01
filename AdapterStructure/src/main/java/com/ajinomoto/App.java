package com.ajinomoto;

import com.ajinomoto.estructural.Adaptador;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Adaptador conversor = new Adaptador();
        conversor.ingresarPesetas(2000);
        conversor.ingresarPesetas(5000);
        conversor.ingresarPesetas(1000);
        System.out.println("Total euros: " + conversor.getSaldo());
    }
}
