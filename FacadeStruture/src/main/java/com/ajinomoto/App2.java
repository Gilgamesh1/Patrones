package com.ajinomoto;

import com.ajinomoto.estructural2.Facade;

public class App2 {
    public static void main(String[] args) {
        Facade fachada = new Facade();
        fachada.arrancarCoche();
        System.out.println("\nProceso finalizado.");
    }
}
