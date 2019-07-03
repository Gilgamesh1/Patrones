package com.ajinomoto.visitor3;

import java.util.ArrayList;

public class Factura implements IElemento {
    int codigo;
    ArrayList<Articulo> articulos = new ArrayList<Articulo>();

    public Factura(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void agregarArticulo(Articulo art) {
        this.articulos.add(art);
    }

    @Override
    public void accept(IVisitor visitor) {
        // Procesar el visitor para la factura
        visitor.visit(this);
        // Procesar el visitor para cada artículo en la factura
        for (Articulo art : this.articulos) {
            art.accept(visitor);
        }
    }
}
