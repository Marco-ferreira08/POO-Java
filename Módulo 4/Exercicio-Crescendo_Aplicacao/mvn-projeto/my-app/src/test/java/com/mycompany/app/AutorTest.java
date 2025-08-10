package com.mycompany.app;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.mycompany.app.Model.Autor;
import com.mycompany.app.Model.Livro;

public class AutorTest {
    @Test
    public void testGetNacionalidade() {
        //  Cria intância de Autor
        Autor autor = new Autor("Henrique", "Brasileiro");

        //  Verifica se a nacionalidade retornada é a mesma que foi definida no construtor
        assertEquals("Brasileiro", autor.getNacionalidade());
    }
    @Test
    public void testSetNacionalidade() {
        //  Cria intância de Autor
        Autor autor = new Autor("Henrique", "Brasileiro");

        //  Verifica se a nacionalidade retornada é a mesma que foi definida no construtor
        assertEquals("Brasileiro", autor.getNacionalidade());
    }
    @Test
    public void testGetObrasPublicadas() {
        //  Cria intância de Autor
        Autor autor = new Autor("Geraldo Rodrigues da Costa", "Brasileiro");

        //  Cria um array de livros
        Livro[] livros = new Livro[2];
        livros[0] = new Livro("Portugal e Espanha", autor, "vivências", 12, true);
        livros[1] = new Livro("Caprichos da Natureza", autor, "vivências", 12, true);

        //  Define um array de livros para o autor
        autor.setLivros(livros);

        // Verifica se o array retornado é o mesmo que foi definido
        assertArrayEquals(livros, autor.getObrasPublicadas());
    }
    @Test
    public void testSetObrasPublicadas() {
        //  Cria intância de Autor
        Autor autor = new Autor("Geraldo Rodrigues da Costa", "Brasileiro");

        //  Cria um array de livros
        Livro[] livros = new Livro[2];
        livros[0] = new Livro("Portugal e Espanha", autor, "vivências", 12, true);
        livros[1] = new Livro("Caprichos da Natureza", autor, "vivências", 12, true);

        //  Define um array de livros para o autor
        autor.setLivros(livros);

        //  Verifica se o array retornado é o mesmo que foi definido
        assertArrayEquals(livros, autor.getObrasPublicadas());
    }
    @Test
    public void testGetObrasPublicadasPorGenero() {
        //  Cria isntância de Autor
        Autor autor = new Autor("Machado de Assis", "Brasileiro");

        //  Cria um array de livros
        Livro[] livros = new Livro[4];
        livros[0] = new Livro("A Cartomante", autor, "ficção", 16, true);
        livros[1] = new Livro("Quincas Borba", autor, "romance", 16, true);
        livros[2] = new Livro("Memórias Póstumas de Brás Cubas", autor, "romance", 16, true);
        livros[3] = new Livro("Contos Fluminenses", autor, "ficção", 16, true);

        //  Define um array de livros para autor
        autor.setLivros(livros);

        // Cria um array contendo apenas livros do gênero romance publicados pelo autor
        Livro[] livrosDeRomance = new Livro[2];
        livrosDeRomance[0] = livros[1];
        livrosDeRomance[1] = livros[2];

        // Verifica se o array retornado é o mesmo array de teste que foi criado
        assertArrayEquals(livrosDeRomance, autor.getObrasPublicadasPorGenero("romance"));
    }
}

//  Criar isntância de classe

//  getNacionalidade => retorna a nacionalidade do autor
//  testar se a nacionalidade retornada é a mesma que foi definida no construtor

// setNacionalidade => defini a nacionalidade do autor no construtor
//  testar se a nacionalidade retornada é a mesma que foi definida no construtor

//  getObrasPublicadas => retorna um array com os livros publicados pelo autor
/*   testar se a lista de livros retornada é a mesma que foi definida para a pessoa 
    super de autor */

/*  getObrasPublicadasPorGenero() => retorna um array com livros de um determinado 
    gênero publicados pelo autor */
/*  testar se o array retornado é o mesmo que um array específico que contém apenas 
    livros de um determinado gênero publicados pelo autor */