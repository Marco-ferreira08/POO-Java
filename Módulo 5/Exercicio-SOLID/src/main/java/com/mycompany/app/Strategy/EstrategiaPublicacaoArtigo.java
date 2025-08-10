package com.mycompany.app.Strategy;

import com.mycompany.app.Interface.EstrategiaPublicacao;

public class EstrategiaPublicacaoArtigo implements EstrategiaPublicacao{
    public void publicar() {
        System.out.println("Publicando artigo...");
    }
}
