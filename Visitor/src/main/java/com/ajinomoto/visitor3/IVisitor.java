package com.ajinomoto.visitor3;

public interface IVisitor {
    public void visit(Factura factura);

    public void visit(Articulo art);
}
