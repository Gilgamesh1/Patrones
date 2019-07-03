package com.ajinomoto.command;

import java.util.ArrayList;

public class Menu {
    private ArrayList<IMenuItem> aMenu = new ArrayList<>();

    public Menu() {
    }

    public void add(IMenuItem objMenuItem) {
        this.aMenu.add(objMenuItem);
    }

    public IMenuItem get(int nOpcion) {
        return this.aMenu.get(nOpcion);
    }
}
