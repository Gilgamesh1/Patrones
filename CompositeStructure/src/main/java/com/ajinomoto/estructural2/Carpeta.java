package com.ajinomoto.estructural2;

import java.util.ArrayList;
import java.util.List;

public class Carpeta extends Nodo {
    List<Nodo> nodos = new ArrayList<Nodo>();

    public Carpeta(String nombre, Nodo nodoPadre) {
        this.setTipoNodo(Nodo.CARPETA);
        this.setNombre(nombre);
        this.setNodoPadre(nodoPadre);
    }

    public void insertarNodo(Nodo nodo) {
        nodos.add(nodo);
    }

    public void eliminarNodo(Nodo nodo) {
        nodos.remove(nodo);
    }

    public List<Nodo> getNodos() {
        return nodos;
    }

    public Nodo getNodo(int posicion) {
        return nodos.get(posicion);
    }

    // ----------------------------
    // Recorre cada nodo del árbol mostrando su nombre y el de su nodo padre
    public void mostrarPadres() {
        for (Nodo nodo : nodos) {
            System.out.println("El nodo padre de [" + nodo.getNombre() + "]");
            // Si se trata de otra carpeta, mostrar también su contenido
            if (nodo.getTipoNodo() == Nodo.CARPETA) {
                ((Carpeta) nodo).mostrarPadres();
            }
        }
    }

    @Override
    public void mostrar() {
        System.out.println("Listando carpeta [" + this.getNombre() + "]");
        for (Nodo nodo : nodos) {
            nodo.mostrar();
        }
    }
}
