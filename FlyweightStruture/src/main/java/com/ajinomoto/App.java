package com.ajinomoto;

import com.ajinomoto.estrutural.FabricaDeLineas;
import com.ajinomoto.estrutural.ILineaLigera;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        FabricaDeLineas fabrica=new FabricaDeLineas();
        ILineaLigera linea1=fabrica.getLine("Azul");
        ILineaLigera linea2=fabrica.getLine("Rojo");
        ILineaLigera linea3=fabrica.getLine("Amarillo");
        ILineaLigera linea4=fabrica.getLine("Azul");
        System.out.println("-------------------");
        //Se puedes usar las lineas de forma independientemente
        linea1.dibujar(100,400);
        linea2.dibujar(200,500);
        linea3.dibujar(300,600);
        linea4.dibujar(400,700);
    }
}
