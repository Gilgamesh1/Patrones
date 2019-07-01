package com.ajimonoto.fabrica;

public abstract class BuilderCoche {
    protected Coche coche;

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public void crearNuevoCoche() {
        this.coche = new Coche();
    }

    // Métodos que deberán ser construídos por las clases que hereden de ésta
    public abstract void construirMotor();

    public abstract void construirCarroceria();

    public abstract void construirAireAcond();

    public abstract void construirElevaLunas();
}
