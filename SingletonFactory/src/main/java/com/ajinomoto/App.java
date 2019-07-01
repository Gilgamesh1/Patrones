package com.ajinomoto;

import com.ajinomoto.fabrica.Coche;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        for (int num = 1; num <= 5; num++) {
            Coche.getInstance();
        }
    }
}
