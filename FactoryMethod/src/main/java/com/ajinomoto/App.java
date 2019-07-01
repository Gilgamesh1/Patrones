package com.ajinomoto;

import com.ajinomoto.fabrica.Creador;
import com.ajinomoto.fabrica.Creador2;
import com.ajinomoto.fabrica.CreadorAbstracto;
import com.ajinomoto.fabrica.IArchivo;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        CreadorAbstracto creator = new Creador();
        IArchivo audio = creator.crear(Creador.AUDIO);
        audio.reproducir();
        IArchivo video = creator.crear(Creador.VIDEO);
        video.reproducir();

        // Otra forma de implementarlo
        IArchivo video2 = Creador2.getArchivo( Creador.VIDEO );
        video2.reproducir();
        IArchivo audio2 = Creador2.getArchivo( Creador.AUDIO );
        audio2.reproducir();
    }
}
