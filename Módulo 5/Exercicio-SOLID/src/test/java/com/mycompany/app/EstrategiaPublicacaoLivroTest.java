package com.mycompany.app;

import org.junit.Test;

import com.mycompany.app.Strategy.EstrategiaPublicacaoLivro;

public class EstrategiaPublicacaoLivroTest {
    @Test
    public void testPublicar() {
        //  Cria intância de EstrategiaPublicacaoArtigo
        EstrategiaPublicacaoLivro estrategia = new EstrategiaPublicacaoLivro();

        //  Executa o método a fim de atestar o seu funcionamento
        estrategia.publicar();
    }
}
