package com.ajinomoto;

import com.ajinomoto.estructural2.Archivo;
import com.ajinomoto.estructural2.Carpeta;

public class App2 {
    public static void main(String[] args) {
        // Crear la carpeta principal e insertar archivos
        Carpeta c1 = new Carpeta("CARPETA_1", null);
        c1.insertarNodo(new Archivo("Archivo1.txt", c1));
        c1.insertarNodo(new Archivo("Archivo2.txt", c1));
        c1.insertarNodo(new Archivo("Archivo3.txt", c1));
        // Crear una subcarpeta e insertar archivos
        Carpeta c2 = new Carpeta("CARPETA_2", c1);
        c2.insertarNodo(new Archivo("Archivo4.txt", c2));
        c2.insertarNodo(new Archivo("Archivo5.txt", c2));
        // Insertar la subcarpeta dentro de la principal
        c1.insertarNodo(c2);
        // Insertar otro archivo dentro de la carpeta principal
        c1.insertarNodo(new Archivo("Archivo6.txt", c1));
        c1.mostrarPadres();
        c1.mostrar();
    }
}
