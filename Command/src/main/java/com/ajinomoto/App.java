package com.ajinomoto;

import com.ajinomoto.command.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Crear el objeto Menú (el Invocador)
        Menu objMenu=new Menu();

        // Crear el Receptor
        Receptor objReceptor=new Receptor();

        // Crear las opciones de menú, indicándoles el Receptor
        IMenuItem objOpcionAbrir=new MenuItemAbrir(objReceptor);
        IMenuItem objOpcionImprimir=new MenuItemImprimir(objReceptor);
        IMenuItem objOpcionSalir=new MenuItemSalir(objReceptor);

        // Agregar las opciones al Menú
        objMenu.add(objOpcionAbrir);
        objMenu.add(objOpcionImprimir);
        objMenu.add(objOpcionSalir);

        // Ejecutar cada opción del menú
        objMenu.get(0).ejecutar();
        objMenu.get(1).ejecutar();
        objMenu.get(2).ejecutar();
    }
}
