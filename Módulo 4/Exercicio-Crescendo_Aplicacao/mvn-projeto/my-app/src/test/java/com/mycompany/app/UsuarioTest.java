package com.mycompany.app;
import java.util.Date;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.mycompany.app.Model.Autor;
import com.mycompany.app.Model.Emprestimo;
import com.mycompany.app.Model.Livro;
import com.mycompany.app.Model.Usuario;

public class UsuarioTest {
    @Test
    public void testGetIdade() {
        //  Cria instância da classe Usuario
        Usuario usuario = new Usuario("Henrique", 16);

        //  Testa se o nome retornado é o mesmo que foi definido no construtor
        assertEquals(16, usuario.getIdade());
    }
    @Test
    public void testSetIdade() {
        //  Cria instância da classe Usuario
        Usuario usuario = new Usuario("Henrique", 16);

        //  Testa se o nome retornado é o mesmo que foi definido no construtor
        assertEquals(16, usuario.getIdade());
    }
    @Test
    public void testGetHistoricoEmprestimos() {

        //  Cria duas intâncias de data
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();

        //  Cria instância da classe
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", 16, true);

        //  Cria instância da classe Usuario
        Usuario usuario = new Usuario("Gabriel", 21);

        //  Cria um array de emprestimos e adiciona um emprestimo a ele
        Emprestimo[] emprestimos = new Emprestimo[1];
        emprestimos[0] = new Emprestimo(livro, usuario, dataRetirada, dataDevolucao);

        //  Define uma lista de emprestimos ao usuário
        usuario.setHistoricoEmprestimos(emprestimos);

        // Testa se o array retornado é o mesmo que foi definido
        assertArrayEquals(emprestimos, usuario.getHistoricoEmprestimos());
    }
    @Test
    public void testSetHistoricoEmprestimos() {

        //  Cria duas intâncias de data
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();

        //  Cria instância da classe
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", 16, true);

        //  Cria instância da classe Usuario
        Usuario usuario = new Usuario("Gabriel", 21);

        //  Cria um array de emprestimos e adiciona um emprestimo a ele
        Emprestimo[] emprestimos = new Emprestimo[1];
        emprestimos[0] = new Emprestimo(livro, usuario, dataRetirada, dataDevolucao);

        //  Define uma lista de emprestimos ao usuário
        usuario.setHistoricoEmprestimos(emprestimos);

        // Testa se o array retornado é o mesmo que foi definido
        assertArrayEquals(emprestimos, usuario.getHistoricoEmprestimos());
    }
}

//  Criar instância de Usuario

//  getIdade => retorna a idade do usuário
//  testar se a idade retornada é a mesma definida no construtor

//  setIdade => define uma idade ao usuário no construtor
//  testar se a idade retornada é a mesma definida no construtor

//  getHistoricoEmprestimos => retorna um array com o histórico de empréstimos do usuário
//  testar se o array de empréstimos retornado é o mesmo que foi definido

//  setHistóricoEmprestimos => define um array de empréstimos ao usuário
//  testar se o array de empréstimos retornado é o mesmo que foi definido