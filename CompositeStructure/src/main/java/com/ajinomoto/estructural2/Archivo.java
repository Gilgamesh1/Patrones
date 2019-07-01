package com.ajinomoto.estructural2;

public class Archivo extends Nodo {
    public Archivo(String nombre, Nodo nodoPadre) {
        this.setTipoNodo(Nodo.ARCHIVO);
        this.setNombre(nombre);
        this.setNodoPadre(nodoPadre);
    }

    @Override
    public void mostrar() {
        System.out.println("Mostrando el contenido del archivo [" + this.getNombre() + "]");
    }
}
