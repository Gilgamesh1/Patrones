package com.ajinomoto;

import com.ajinomoto.strategy.Multiplicar;
import com.ajinomoto.strategy.OperacionAritmetica;
import com.ajinomoto.strategy.Restar;
import com.ajinomoto.strategy.Sumar;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        OperacionAritmetica context = null;
        context = new OperacionAritmetica(new Sumar());
        int suma = context.procesar(3, 4);
        context = new OperacionAritmetica(new Restar());
        int resta = context.procesar(3, 4);
        context = new OperacionAritmetica(new Multiplicar());
        int multip = context.procesar(3, 4);

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multip);
    }
}
