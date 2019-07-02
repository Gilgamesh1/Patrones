package com.ajinomoto.visitor1;

import java.util.List;

public class EquiparArma implements IVisitor {
    @Override
    public void visit(Mago m) {
        m.setArma("Daga");
    }

    @Override
    public void visit(Guerrero g) {
        g.setArma("Espada");
    }

    @Override
    public void visit(List<IPersonaje> personajes) {
        for (IPersonaje p : personajes) {
            p.accept(this);
        }
    }
}
