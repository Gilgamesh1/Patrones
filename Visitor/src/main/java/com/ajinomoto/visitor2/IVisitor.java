package com.ajinomoto.visitor2;

import java.util.List;

public interface IVisitor {
    public void visit(Mago m);

    public void visit(Guerrero g);

    public void visit(List<IPersonaje> personajes);
}
