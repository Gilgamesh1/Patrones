package com.ajinomoto.estructural;

public abstract class Nodo {
    public static final int ARCHIVO = 1;
    public static final int CARPETA = 2;
    protected String nombre = "";
    protected int tipoNodo;

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

    // Método a implementar por las clases que hereden
    public abstract void mostrar();
}
