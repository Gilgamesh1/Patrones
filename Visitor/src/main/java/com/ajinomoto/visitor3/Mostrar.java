package com.ajinomoto.visitor3;

public class Mostrar implements IVisitor {
    public Mostrar() {
    }

    @Override
    public void visit(Factura factura) {
        System.out.println("=========================");
        System.out.println( "Factura número [" + factura.getCodigo() + "]" );
    }

    @Override
    public void visit(Articulo art) {
        System.out.println( "Artículo [" + art.getNombre() + "] --> [" + art.getUnidades() + "] unidades)" );
    }
}
