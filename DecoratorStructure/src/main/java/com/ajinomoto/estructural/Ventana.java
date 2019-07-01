package com.ajinomoto.estructural;

public class Ventana implements IVentana {
   public Ventana(){

   }
    @Override
    public void dibujar(int columna, int fila) {
        System.out.println("Dibujada ventana básica en ["+columna+"],["+fila+"]");
    }
}
