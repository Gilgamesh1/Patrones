package com.ajinomoto.fabrica;

public class Creador2 {
    public static final int AUDIO = 1;
    public static final int VIDEO = 2;

    // ---------------------------------------
    public Creador2() {
    }

    // ---------------------------------------
    public static IArchivo getArchivo(int tipo) {
        IArchivo objeto;
        switch (tipo) {
            case AUDIO:
                objeto = new ArchivoAudio();
                break;
            case VIDEO:
                objeto = new ArchivoVideo();
                break;
            default:
                objeto = null;
        }
        return objeto;
    }
}
