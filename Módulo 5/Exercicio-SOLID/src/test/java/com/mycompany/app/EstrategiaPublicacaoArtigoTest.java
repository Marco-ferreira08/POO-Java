package com.mycompany.app;

import org.junit.Test;

import com.mycompany.app.Strategy.EstrategiaPublicacaoArtigo;

public class EstrategiaPublicacaoArtigoTest {
    @Test
    public void testPublicar() {
        //  Cria intância de EstrategiaPublicacaoArtigo
        EstrategiaPublicacaoArtigo estrategia = new EstrategiaPublicacaoArtigo();

        //  Executa o método a fim de atestar o seu funcionamento
        estrategia.publicar();
    }
}
