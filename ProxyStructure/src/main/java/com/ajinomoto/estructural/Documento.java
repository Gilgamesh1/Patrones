package com.ajinomoto.estructural;

public class Documento {
    private String nombreDoc;
    private String texto;
    private ImagenProxy imgProxy;

    public Documento(String nombreDoc) {
        this.nombreDoc = nombreDoc;
    }

    public String getNombreDoc() {
        return nombreDoc;
    }

    public void setNombreDoc(String nombreDoc) {
        this.nombreDoc = nombreDoc;
    }

    public void cargarContenido() {
        //Aqui cargaíamos el archivo y obtendríamos su contenido
        this.texto = "Texto del documento";
        this.imgProxy = new ImagenProxy("imagen.jpg");
        System.out.println("Documento cargado en memoria");
    }

    public void mostrar() {
        System.out.println("Mostrando contenido...\n");
    }

    public void hacerScroll() {
        System.out.println("El usuario ha hecho scroll");
        imgProxy.mostrarImagen();
    }
}
