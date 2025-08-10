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
        Autor autor = new Autor("Henrique", "Brasileiro", true);

        //  Verifica se a nacionalidade retornada é a mesma que foi definida no construtor
        assertEquals("Brasileiro", autor.getNacionalidade());
    }
    @Test
    public void testSetNacionalidade() {
        //  Cria intância de Autor
        Autor autor = new Autor("Henrique", "Brasileiro", true);

        //  Verifica se a nacionalidade retornada é a mesma que foi definida no construtor
        assertEquals("Brasileiro", autor.getNacionalidade());
    }
    @Test
    public void testGetObrasPublicadas() {
        //  Cria intância de Autor
        Autor autor = new Autor("Geraldo Rodrigues da Costa", "Brasileiro", false);

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
        Autor autor = new Autor("Geraldo Rodrigues da Costa", "Brasileiro", false);

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
        Autor autor = new Autor("Machado de Assis", "Brasileiro", false);

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
    @Test
    public void testIsAutorUsuario() {
        //  Cria duas intâncias de Autor
        Autor autor1 = new Autor("Henrique", "Brasileiro", true);
        Autor autor2 = new Autor("Geraldo Rodrigues da Costa", "Brasileiro", false);

        //  Testa se o valor booleano retornado é o mesmo que foi definido no construtor
        assertEquals(true, autor1.isAutorUsuario());
        assertEquals(false, autor2.isAutorUsuario());
    }
    @Test
    public void testSetAutorUsuario() {
        //  Cria duas intâncias de Autor
        Autor autor1 = new Autor("Henrique", "Brasileiro", false);
        Autor autor2 = new Autor("Geraldo Rodrigues da Costa", "Brasileiro", true);

        //  Muda o valor de autorUsuario
        autor1.setAutorUsuario(true);
        autor2.setAutorUsuario(false);

        //  Testa se o valor booleano retornado é o mesmo que foi definido pelo método setAutorUsuario
        assertEquals(true, autor1.isAutorUsuario());
        assertEquals(false, autor2.isAutorUsuario());
    }
}

