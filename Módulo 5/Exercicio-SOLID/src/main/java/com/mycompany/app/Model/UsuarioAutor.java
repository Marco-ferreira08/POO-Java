package com.mycompany.app.Model;

import com.mycompany.app.Interface.EstrategiaPublicacao;

public class UsuarioAutor implements EstrategiaPublicacao{
    private EstrategiaPublicacao estrategiaPublicacao;

    public EstrategiaPublicacao getEstrategiaPublicacao() {
        return estrategiaPublicacao;
    }

    public void setEstrategiaPublicao(EstrategiaPublicacao estrategiaPublicacao) {
        this.estrategiaPublicacao = estrategiaPublicacao;
    }

    public void publicar() {
        estrategiaPublicacao.publicar();
        System.out.println("Publicando como usuario...");
    }

}