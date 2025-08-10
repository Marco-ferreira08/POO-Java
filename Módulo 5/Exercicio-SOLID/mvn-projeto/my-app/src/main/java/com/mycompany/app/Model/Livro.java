package com.mycompany.app.Model;

public class Livro {
	private String titulo;
	private Autor autor;
	private String genero;
	private int faixaEtaria;
	private boolean disponivel;

	public Livro(String titulo, Autor autor, String genero,int faixaEtaria, boolean disponivel) {
		this.titulo =  titulo;
		this.autor = autor;
		this.genero = genero;
		this.faixaEtaria = faixaEtaria;
		this.disponivel = disponivel;
	}

	public void setDisponibilidade(boolean disponivel) {
		this.disponivel = disponivel;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public Autor getAutor() {
		return this.autor;
	}

	public String getGenero() {
		return this.genero;
	}

	public int getFaixaEtaria() {
                return this.faixaEtaria;
        }

	public boolean isDisponivel() {
		return disponivel;
	}

	public void validarDisponibilidade() {
		if (isDisponivel()) {
			System.out.println("O livro está disponível para empréstimo.");
		} else {
			System.out.println("O livro não está disponível para empréstimo.");
		}
	}
}
