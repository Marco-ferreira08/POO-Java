package com.mycompany.app.Model;

public class Pessoa {
	private String nome;
	private Livro[] livros;

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public Livro[] getLivros() {
		return this.livros;
	}

	public void setLivros(Livro[] livros) {
		this.livros = livros;
	}
}
