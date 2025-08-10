package com.mycompany.app;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.mycompany.app.Model.Autor;
import com.mycompany.app.Model.Livro;
import com.mycompany.app.Model.Pessoa;

public class PessoaTest {
    @Test
    public void testGetNome() {
        //  Cria uma intância da classe Pessoa
        Pessoa pessoa = new Pessoa("Henrique");

        // Verifica se o nome retornado é o mesmo que foi definido
        assertEquals("Henrique", pessoa.getNome());
    }
    @Test
    public void testSetNome() {
        // Cria uma intância da classe pessoa
        Pessoa pessoa = new Pessoa("Henrique");

        // Verifica se o nome que foi retornado é o mesmo que foi definido
        assertEquals("Henrique", pessoa.getNome());
    }
    @Test
    public void testGetLivros() {
        // Cria instância da classe Pessoa e da classe Autor
        Pessoa pessoa = new Pessoa("Jess");
        Autor autor = new Autor("Jess", "Brasileira");

        // Define uma lista de livros para a Pessoa
        Livro[] livros = new Livro[2];
        livros[0] = new Livro("Java Basico", autor, "tecnologia", 16, true);
        livros[1] = new Livro("Java Avançado", autor,"tecnologia", 16, true);
        pessoa.setLivros(livros);

        // Verifica se a lista de livros retornada é a mesma que foi definida
        assertArrayEquals(livros, pessoa.getLivros());
    }
    @Test
    public void testSetLivros() {
        Pessoa pessoa = new Pessoa("Maurice Leblanc");
        Autor autor = new Autor("Maurice Leblanc", "Francês");

        Livro[] livros = new Livro[1];
        livros[0] = new Livro("Arsène Lupin vs Sherlock Holmes", autor, "mistério", 12, true);
        pessoa.setLivros(livros);

        assertArrayEquals(livros, pessoa.getLivros());
    }
}
//  Isntância de pessoa de pessoa com um nome


//  getNome() => Retorna o nome da pessoa 
//  comparar com o nome passado com setName()

//  setNome() => Atribui um valor para a propriedade nome
//  Comparar com o nome que vem do getNome() é o mesmo que passamos em setNome()

//  getLivros() => Retorna uma lista de livros atribuidas a uma pessoa
//  Comparar se a lista retornada é a mesma que passamos para setLivros()

//  setLivros() => Atribui uma lista de livros a uma pessoa
//  Comparar se o valor do getLivros() é o mesmo de passamos em setLivros()
