package com.mycompany.app;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.mycompany.app.Model.Autor;
import com.mycompany.app.Model.Emprestimo;
import com.mycompany.app.Model.Livro;
import com.mycompany.app.Model.Usuario;

public class TestEmprestimo {
    @Test
    public void testGetLivro() {
        //  Cria duas intâncias de data
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();

        //  Cria uma intância da classe Livro
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês", false), "Tecnologia", 16, true);

        //  Cria uma intância da classe Usuario
        Usuario usuario = new Usuario("Gabriel", 21);

        //  Cria uma intância da classe Emprestimo
        Emprestimo emprestimo = new Emprestimo(livro, usuario, dataRetirada, dataDevolucao);

        //  Verifica se o livro retornado é o mesmo que foi definido no construtor
        assertEquals(livro, emprestimo.getLivro());
    }
    @Test
    public void testSetLivro() {
        //  Cria duas intâncias de data
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();

        //  Cria uma intância da classe Livro
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês", false), "Tecnologia", 16, true);

        //  Cria uma intância da classe Usuario
        Usuario usuario = new Usuario("Gabriel", 21);

        //  Cria uma intância da classe Emprestimo
        Emprestimo emprestimo = new Emprestimo(livro, usuario, dataRetirada, dataDevolucao);

        //  Verifica se o livro retornado é o mesmo que foi definido no construtor
        assertEquals(livro, emprestimo.getLivro());
    }
    @Test
    public void tesGetUsuario() {
        //  Cria duas intâncias de data
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();

        //  Cria uma intância da classe Livro
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês", false), "Tecnologia", 16, true);

        //  Cria uma intância da classe Usuario
        Usuario usuario = new Usuario("Gabriel", 21);

        //  Cria uma intância da classe Emprestimo
        Emprestimo emprestimo = new Emprestimo(livro, usuario, dataRetirada, dataDevolucao);

        //  Verifica se o usuario retornado é o mesmo que foi definido no construtor
        assertEquals(usuario, emprestimo.getUsuario());
    }
    @Test
    public void tesSetUsuario() {
        //  Cria duas intâncias de data
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();

        //  Cria uma intância da classe Livro
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês", false), "Tecnologia", 16, true);

        //  Cria uma intância da classe Usuario
        Usuario usuario = new Usuario("Gabriel", 21);

        //  Cria uma intância da classe Emprestimo
        Emprestimo emprestimo = new Emprestimo(livro, usuario, dataRetirada, dataDevolucao);

        //  Verifica se o usuario retornado é o mesmo que foi definido no construtor
        assertEquals(usuario, emprestimo.getUsuario());
    }
    @Test
    public void tesGetDataRetirada() {
        //  Cria duas intâncias de data
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();

        //  Cria uma intância da classe Livro
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês", false), "Tecnologia", 16, true);

        //  Cria uma intância da classe Usuario
        Usuario usuario = new Usuario("Gabriel", 21);

        //  Cria uma intância da classe Emprestimo
        Emprestimo emprestimo = new Emprestimo(livro, usuario, dataRetirada, dataDevolucao);

        //  Verifica se a data de retirada retornada é a mesma que foi definida no construtor
        assertEquals(dataRetirada, emprestimo.getDataRetirada());
    }
    @Test
    public void tesSetDataRetirada() {
        //  Cria duas intâncias de data
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();

        //  Cria uma intância da classe Livro
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês", false), "Tecnologia", 16, true);

        //  Cria uma intância da classe Usuario
        Usuario usuario = new Usuario("Gabriel", 21);

        //  Cria uma intância da classe Emprestimo
        Emprestimo emprestimo = new Emprestimo(livro, usuario, dataRetirada, dataDevolucao);

        //  Verifica se a data de retirada retornada é a mesma que foi definida no construtor
        assertEquals(dataRetirada, emprestimo.getDataRetirada());
    }
    @Test
    public void tesGetDataDevolucao() {
        //  Cria duas intâncias de data
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();

        //  Cria uma intância da classe Livro
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês", false), "Tecnologia", 16, true);

        //  Cria uma intância da classe Usuario
        Usuario usuario = new Usuario("Gabriel", 21);

        //  Cria uma intância da classe Emprestimo
        Emprestimo emprestimo = new Emprestimo(livro, usuario, dataRetirada, dataDevolucao);

        //  Verifica se a data de devoulção retornada é a mesma que foi definida no construtor
        assertEquals(dataDevolucao, emprestimo.getDataDevolucao());
    }
    @Test
    public void tesSetDataDevolucao() {
        //  Cria duas intâncias de data
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();

        //  Cria uma intância da classe Livro
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês", false), "Tecnologia", 16, true);

        //  Cria uma intância da classe Usuario
        Usuario usuario = new Usuario("Gabriel", 21);

        //  Cria uma intância da classe Emprestimo
        Emprestimo emprestimo = new Emprestimo(livro, usuario, dataRetirada, dataDevolucao);

        //  Verifica se a data de devoulção retornada é a mesma que foi definida no construtor
        assertEquals(dataDevolucao, emprestimo.getDataDevolucao());
    }
}
