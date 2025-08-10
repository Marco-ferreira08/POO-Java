package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.mycompany.app.Model.Autor;
import com.mycompany.app.Model.Livro;

public class LivroTest {
    @Test
    public void testGetTitulo() {
        //  Cria isntância da classe Autor
        Autor autor = new Autor("Jess", "Brasileira");

        //  Cria isntância da classe Livro
        Livro livro = new Livro("Java Basico", autor, "tecnologia", 16,true);
    
        //  Verifica se o título retornado é o mesmo que foi definido no construtor
        assertEquals("Java Basico", livro.getTitulo());
    }
    @Test
    public void testSetTitulo() {
        //  Cria isntância da classe Autor
        Autor autor = new Autor("Jess", "Brasileira");

        //  Cria isntância da classe Livro
        Livro livro = new Livro("Java Basico", autor, "tecnologia", 16,true);
    
        //  Verifica se o título retornado é o mesmo que foi definido no construtor
        assertEquals("Java Basico", livro.getTitulo());
    }
    @Test
    public void testGetAutor() {
        //  Cria isntância da classe Autor
        Autor autor = new Autor("Jess", "Brasileira");

        //  Cria isntância da classe Livro
        Livro livro = new Livro("Java Basico", autor, "tecnologia", 16,true);
    
        //  Verifica se o autor retornado é o mesmo que foi definido no construtor
        assertEquals(autor, livro.getAutor());
    }
    @Test
    public void testSetAutor() {
        //  Cria isntância da classe Autor
        Autor autor = new Autor("Jess", "Brasileira");

        //  Cria isntância da classe Livro
        Livro livro = new Livro("Java Basico", autor, "tecnologia", 16,true);
    
        //  Verifica se o autor retornado é o mesmo que foi definido no construtor
        assertEquals(autor, livro.getAutor());
    }
    @Test
    public void testGetGenero() {
        //  Cria isntância da classe Autor
        Autor autor = new Autor("Jess", "Brasileira");

        //  Cria isntância da classe Livro
        Livro livro = new Livro("Java Basico", autor, "tecnologia", 16,true);
    
        //  Verifica se o genero retornado é o mesmo que foi definido no construtor
        assertEquals("tecnologia", livro.getGenero());
    }
    @Test
    public void testSetGenero() {
        //  Cria isntância da classe Autor
        Autor autor = new Autor("Jess", "Brasileira");

        //  Cria isntância da classe Livro
        Livro livro = new Livro("Java Basico", autor, "tecnologia", 16,true);
    
        //  Verifica se o genero retornado é o mesmo que foi definido no construtor
        assertEquals("tecnologia", livro.getGenero());
    }
    @Test
    public void testGetFaixaEtaria() {
        //  Cria isntância da classe Autor
        Autor autor = new Autor("Jess", "Brasileira");

        //  Cria isntância da classe Livro
        Livro livro = new Livro("Java Basico", autor, "tecnologia", 16,true);
    
        //  Verifica se a faixa etária retornada é a mesma que foi definida no construtor
        assertEquals(16, livro.getFaixaEtaria());
    }
    @Test
    public void testSetFaixaEtaria() {
        //  Cria isntância da classe Autor
        Autor autor = new Autor("Jess", "Brasileira");

        //  Cria isntância da classe Livro
        Livro livro = new Livro("Java Basico", autor, "tecnologia", 16,true);
    
        //  Verifica se a faixa etária retornada é a mesma que foi definida no construtor
        assertEquals(16, livro.getFaixaEtaria());
    }
    @Test
    public void testIsDisponivel() {
        //  Cria isntância da classe Autor
        Autor autor = new Autor("Jess", "Brasileira");

        //  Cria duas isntâncias da classe Livro
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", 16, true);
        Livro livro2 = new Livro("Java Avançado", autor, "tecnologia", 16, false);

        /*  Verifica se o valor booleano de disponibilidade é o mesmo que foi definido 
            no construtor para ambos os livros */
        assertEquals(true, livro1.isDisponivel());
        assertEquals(false, livro2.isDisponivel());
    }
    @Test
    public void testSetDisponibilidade() {
        //  Cria isntância da classe Autor
        Autor autor = new Autor("Jess", "Brasileira");

        //  Cria duas isntâncias da classe Livro
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", 16, true);
        Livro livro2 = new Livro("Java Avançado", autor, "tecnologia", 16, false);

        /*  Verifica se o valor booleano de disponibilidade é o mesmo que foi definido 
            no construtor para ambos os livros */
        assertEquals(true, livro1.isDisponivel());
        assertEquals(false, livro2.isDisponivel());
    }
    @Test
    public void testValidarDisponibilidade() {
        //  Cria isntância da classe Autor
        Autor autor = new Autor("Jess", "Brasileira");

        //  Cria duas isntâncias da classe Livro
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", 16, true);
        Livro livro2 = new Livro("Java Avançado", autor, "tecnologia", 16, false);

        livro1.validarDisponibilidade();
        livro2.validarDisponibilidade();
    }
}
