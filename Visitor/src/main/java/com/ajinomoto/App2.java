package com.ajinomoto;

import com.ajinomoto.visitor2.*;

import java.util.ArrayList;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        // Crear los guerreros
        Guerrero g1 = new Guerrero();
        Guerrero g2 = new Guerrero();
        // Crear los magos
        Mago m1 = new Mago();
        Mago m2 = new Mago();

        m1.setNivelMagia(3);
        m2.setNivelMagia(7);

        // Crear una lista para guardar los elementos
        List<IPersonaje> personajes = new ArrayList<IPersonaje>();

        // Agregar los elementos a una lista
        personajes.add(g1);
        personajes.add(g2);
        personajes.add(m1);
        personajes.add(m2);

        // Creamos el Visitor y le pasamos la lista para equiparlos con armas
        IVisitor visitorArma = new EquiparArma();
        visitorArma.visit(personajes);

        // Creamos el Visitor y le pasamos la lista para equipar con armaduras a los guerreros
        IVisitor visitorConjuro = new EquiparConjuro();
        visitorConjuro.visit(personajes);

        // Comprobar el resultado:
        System.out.println( "Arma del guerrero g1: " + g1.getArma() );
        System.out.println( "Arma del guerrero g2: " + g2.getArma() );
        System.out.println( "Arma del mago m1: " + m1.getArma() );
        System.out.println( "Arma del mago m1: " + m2.getArma() + "\n");
        System.out.println( "Conjuro del mago m1: " + m1.getConjuro() );
        System.out.println( "Conjuro del mago m1: " + m2.getConjuro() + "\n");
    }

}
