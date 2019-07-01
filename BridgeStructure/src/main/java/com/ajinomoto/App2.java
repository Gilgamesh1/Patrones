package com.ajinomoto;

import com.ajinomoto.estructural2.*;

public class App2 {
    public static void main(String[] args) {
        // Crear un objeto de tipo 'AbstraccionRefinada' indicándole un 'ImplementadorConcreto'
        ElaborarPasta ravioli = new ElaborarRavioli(new Cocinar());
        // Realizar el proceso de que se trate (cocinar)
        ravioli.obtener();
        // Cambiar de implementador y realizar el proceso (envasar)
        ravioli.setImplementador(new Envasar());
        ravioli.obtener();
        System.out.println("-------------");
        ElaborarPasta lasagna = new ElaborarLasagna(new Cocinar());
        ravioli.obtener();
        ravioli.setImplementador(new Envasar());
        ravioli.obtener();
    }
}
