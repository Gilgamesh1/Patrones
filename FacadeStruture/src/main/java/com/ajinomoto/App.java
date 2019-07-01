package com.ajinomoto;

import com.ajinomoto.estructural.Arrancar;
import com.ajinomoto.estructural.ComprobarAsiento;
import com.ajinomoto.estructural.ComprobarEspejos;
import com.ajinomoto.estructural.ComprobarLiquidos;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ComprobarLiquidos liquidos = new ComprobarLiquidos();
        liquidos.comprobar();

        ComprobarAsiento asiento = new ComprobarAsiento();
        asiento.comprobar();

        ComprobarEspejos espejos = new ComprobarEspejos();
        espejos.comprobar();

        Arrancar arrancar = new Arrancar();
        arrancar.encenderContacto();

        System.out.println("\nProceso finalizado.");
    }
}
