package com.mycompany.app;
import java.util.Date;

import com.mycompany.app.Model.Artigo;
import com.mycompany.app.Model.Autor;
import com.mycompany.app.Model.Emprestimo;
import com.mycompany.app.Model.Livro;
import com.mycompany.app.Model.Usuario;

public class Main {
	public static void main(String[] args) {
		Autor autor1= new Autor("Agostinho de Hipona", "Norte-Africano", false);
		Livro livro = new Livro("A Cidade de Deus", autor1,"Filosofia", 16, true);
		Livro[] livros = {livro};
		autor1.setLivros(livros);

		Usuario usuario = new Usuario( "Marco Ferreira", 16);
		Emprestimo emprestimo = new Emprestimo(livro, usuario, new Date(), new Date());
		livro.setDisponibilidade(false);
		Emprestimo[] emprestimos = {emprestimo};
		usuario.setHistoricoEmprestimos(emprestimos);

		livro.validarDisponibilidade();
		System.out.println("Livro: " + emprestimo.getLivro().getTitulo());
		System.out.println("Autor: " + emprestimo.getLivro().getAutor().getNome());
		System.out.println("Gênero: " + emprestimo.getLivro().getGenero());
		System.out.println("Usuário: " + emprestimo.getUsuario().getNome());
		System.out.println("Idade: " + emprestimo.getUsuario().getIdade());
		System.out.println("Data de Retirada: " + emprestimo.getDataRetirada());
		System.out.println("Data de Devolução: " + emprestimo.getDataDevolucao());

		System.out.println("");
		System.out.println("------------------------------------------------------------------------");
		System.out.println("");

		Autor autor2 = new Autor("Jess", "Brasileira", true);
		Artigo artigo = new Artigo("Entendendo Compiladores", autor2, "tecnologia", true);
		System.out.println("Artigo: " + artigo.getTitulo());
		System.out.println("Publicado: " + artigo.isPublicado());
		System.out.println("Gênero: " + artigo.getGenero());
		System.out.println("Autor: " + autor2.getNome());
		System.out.println("Nacionalidade do autor: " + autor2.getNacionalidade());
		System.out.println("É autor usuário: " + autor2.isAutorUsuario());
		

	}
}
