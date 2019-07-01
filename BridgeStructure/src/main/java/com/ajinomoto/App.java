package com.ajinomoto;

import com.ajinomoto.estructural.Carne;
import com.ajinomoto.estructural.ElaborarAlimento;
import com.ajinomoto.estructural.ElaborarLasagna;
import com.ajinomoto.estructural.Verduras;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        // Crear un objeto de tipo 'AbstraccionRefinada' indicándole un 'ImplementadorConcreto'
        ElaborarAlimento lasagna = new ElaborarLasagna(new Carne());
        lasagna.obtener();

        // Ahora le indicamos que use otra implementación para obtener la de verduras
        lasagna.setImplementador(new Verduras());
        lasagna.obtener();
    }
}
