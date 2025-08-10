package com.mycompany.app.Model;

public class Artigo extends Publicacao {
    private String genero;
    private boolean publicado;

    public Artigo(String titulo, Autor autor, String genero, boolean publicado) {
        super(titulo, autor);
        this.genero = genero;
        this.publicado = publicado;
    }

    public String getGenero() {
        return genero;
    }

    public boolean isPublicado() {
        return publicado;
    }

    public void setPublicado(boolean publicado) {
        this.publicado = publicado;
    }

    @Override
    public void validarPublicacao() {
        System.out.println("Validando publicação do artigo...");
    }
}