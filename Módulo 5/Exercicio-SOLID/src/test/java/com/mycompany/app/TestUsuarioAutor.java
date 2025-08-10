package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.mycompany.app.Model.UsuarioAutor;
import com.mycompany.app.Strategy.EstrategiaPublicacaoArtigo;

public class TestUsuarioAutor {
    @Test
    public void testGetEstrategiaPublicacao() {
        //  Cria instâncias de UsuarioAutor e EstrategiaPublicacaoArtigo
        UsuarioAutor usuario = new UsuarioAutor();
        EstrategiaPublicacaoArtigo estrategia = new EstrategiaPublicacaoArtigo();

        //  Define uma EstrategiaPublicacao para usuario
        usuario.setEstrategiaPublicao(estrategia);

        //  Verifica se a EstrategiaPublicacao retornada é a mesma que foi definida
        assertEquals(estrategia, usuario.getEstrategiaPublicacao());
    }
    @Test
    public void testSetEstrategiaPublicacao() {
        //  Cria instâncias de UsuarioAutor e EstrategiaPublicacao
        UsuarioAutor usuario = new UsuarioAutor();
        EstrategiaPublicacaoArtigo estrategia = new EstrategiaPublicacaoArtigo();

        //  Define uma EstrategiaPublicacao para usuario
        usuario.setEstrategiaPublicao(estrategia);

        //  Verifica se a EstrategiaPublicacao retornada é a mesma que foi definida
        assertEquals(estrategia, usuario.getEstrategiaPublicacao());
    }
    @Test
    public void testPublicar() {
        //  Cria instâncias de UsuarioAutor e EstrategiaPublicacao
        UsuarioAutor usuario = new UsuarioAutor();
        EstrategiaPublicacaoArtigo estrategia = new EstrategiaPublicacaoArtigo();

        //  Define uma EstrategiaPublicacao para usuario
        usuario.setEstrategiaPublicao(estrategia);

        //  Executa o método Publicar a fim de atestar o seu funcionamento
        usuario.publicar();
    }
}
