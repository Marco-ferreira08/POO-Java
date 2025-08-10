package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.mycompany.app.Model.Artigo;
import com.mycompany.app.Model.Autor;

public class ArtigoTest {
    @Test
    public void testGetTitulo() {
        //  Cria isntâncias das classes Autor e Artigo
        Autor autor = new Autor("Henrique", "Brasileira", true);
        Artigo artigo = new Artigo("Java Basico", autor, "tecnologia", true);
    
        //  Verifica se o título retornado é o mesmo que foi definido no construtor
        assertEquals("Java Basico", artigo.getTitulo());
    }
    @Test
    public void testSetTitulo() {
        //  Cria isntâncias das classes Autor e Artigo
        Autor autor = new Autor("Henrique", "Brasileira", true);
        Artigo artigo = new Artigo("Java Basico", autor, "tecnologia", true);
    
        //  Verifica se o título retornado é o mesmo que foi definido no construtor
        assertEquals("Java Basico", artigo.getTitulo());
    }
    @Test
    public void testGetAutor() {
        //  Cria isntâncias das classes Autor e Artigo
        Autor autor = new Autor("Henrique", "Brasileira", true);
        Artigo artigo = new Artigo("Java Basico", autor, "tecnologia", true);
    
        //  Verifica se o autor retornado é o mesmo que foi definido no construtor
        assertEquals(autor, artigo.getAutor());
    }
    @Test
    public void testSetAutor() {
        //  Cria isntâncias das classes Autor e Artigo
        Autor autor = new Autor("Henrique", "Brasileira", true);
        Artigo artigo = new Artigo("Java Basico", autor, "tecnologia", true);
    
        //  Verifica se o autor retornado é o mesmo que foi definido no construtor
        assertEquals(autor, artigo.getAutor());
    }
    @Test
    public void testGetGenero() {
        //  Cria instâncias das classes Autor e Artigo
        Autor autor = new Autor("Henrique", "Brasileiro", true);
		Artigo artigo = new Artigo("O papel da programação em minha vida", autor, "biografia", false);

        //  Verifica se o gênero retornado é o mesmo que foi definido
        assertEquals("biografia", artigo.getGenero());
    }
    @Test
    public void testSetGenero() {
        //  Cria instâncias das classes Autor e Artigo
        Autor autor = new Autor("Henrique", "Brasileiro", true);
		Artigo artigo = new Artigo("O papel da programação em minha vida", autor, "biografia", false);

        //  Verifica se o gênero retornado é o mesmo que foi definido
        assertEquals("biografia", artigo.getGenero());
    }
    @Test
    public void testIsPublicado() {
        //  Cria instâncias das classes Autor e Artigo
        Autor autor1 = new Autor("Henrique", "Brasileiro", true);
        Autor autor2 = new Autor("Jess", "Brasileira", true);
		Artigo artigo1 = new Artigo("O papel da programação em minha vida", autor1, "biografia", false);
		Artigo artigo2 = new Artigo("Entendendo Compiladores", autor2, "tecnologia", true);

        //  Verifica se o gênero retornado é o mesmo que foi definido
        assertEquals(false, artigo1.isPublicado());
        assertEquals(true, artigo2.isPublicado());
    }

    @Test
    public void testSetPublicado() {
        //  Cria instâncias das classes Autor e Artigo
        Autor autor1 = new Autor("Henrique", "Brasileiro", true);
        Autor autor2 = new Autor("Jess", "Brasileira", true);
		Artigo artigo1 = new Artigo("O papel da programação em minha vida", autor1, "biografia", true);
		Artigo artigo2 = new Artigo("Entendendo Compiladores", autor2, "tecnologia", false);

        //  Muda o publicado dos artigos
        artigo1.setPublicado(false);
        artigo2.setPublicado(true);

        //  Verifica se o gênero retornado é o mesmo que foi definido
        assertEquals(false, artigo1.isPublicado());
        assertEquals(true, artigo2.isPublicado());
    }
    @Test
    public void testvalidarPublicacao() {
        //  Cria instâncias das classes Autor e Artigo
        Autor autor = new Autor("Henrique", "Brasileiro", true);
		Artigo artigo = new Artigo("O papel da programação em minha vida", autor, "biografia", false);

        //  Executa o método validarPublicacao a fim de testar se está funcionando corretamente
        artigo.validarPublicacao();
    }
}
