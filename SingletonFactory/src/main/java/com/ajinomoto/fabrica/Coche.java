package com.ajinomoto.fabrica;

public class Coche {
    private static Coche instancia;

    private Coche() {
    }

    public static Coche getInstance() {
        if (instancia == null) {
            instancia = new Coche();
            System.out.println("El objeto ha sido creado");
        } else {
            System.out.println("Ya existe el objeto");
        }
        return instancia;
    }
}
