package com.ajinomoto.estructural2;

public abstract class Nodo {
    public static final int ARCHIVO = 1;
    public static final int CARPETA = 2;
    protected String nombre = "";
    protected int tipoNodo;
    protected Nodo nodoPadre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipoNodo() {
        return tipoNodo;
    }

    public void setTipoNodo(int tipoNodo) {
        this.tipoNodo = tipoNodo;
    }

    public Nodo getNodoPadre() {
        return nodoPadre;
    }

    public void setNodoPadre(Nodo nodoPadre) {
        this.nodoPadre = nodoPadre;
    }

    // ----------------------------
    // Método a implementar por las clases que hereden
    public abstract void mostrar();
}
