package com.ajinomoto;

import com.ajinomoto.templateMethod.ClaseConcreta1;
import com.ajinomoto.templateMethod.ClaseConcreta2;
import com.ajinomoto.templateMethod.ClaseConcreta3;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ClaseConcreta1 cc1 = new ClaseConcreta1();
        ClaseConcreta2 cc2 = new ClaseConcreta2();
        ClaseConcreta3 cc3 = new ClaseConcreta3();
        // Obtener el resultado de multiplicar 3 por 100 y restarle 10
        int num1 = cc1.obtener(3);
        System.out.println("num1: " + num1);
        // Obtener el resultado de multiplicar 3 por 1000 y restarle 100
        int num2 = cc2.obtener(50);
        System.out.println("num2: " + num2);

        // Obtener el resultado de multiplicar 3 por 1000 y restarle 100
        int num3 = cc3.obtener(30);
        System.out.println("num3: " + num3);
    }
}
