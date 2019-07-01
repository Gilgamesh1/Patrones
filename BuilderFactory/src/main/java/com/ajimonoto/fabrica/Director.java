package com.ajimonoto.fabrica;


public class Director{
    public Director() {
    }

    public void construir(BuilderCoche builder){
        builder.crearNuevoCoche();
        builder.construirMotor();
        builder.construirCarroceria();
        builder.construirElevaLunas();
        builder.construirAireAcond();
    }
}