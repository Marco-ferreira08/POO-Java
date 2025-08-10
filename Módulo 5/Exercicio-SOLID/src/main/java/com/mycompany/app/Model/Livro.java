package com.mycompany.app.Model;

public class Livro extends Publicacao {
	private String genero;
	private int faixaEtaria;
	private boolean disponivel;

	public Livro(String titulo, Autor autor, String genero,int faixaEtaria, boolean disponivel) {
		super(titulo, autor);
		this.genero = genero;
		this.faixaEtaria = faixaEtaria;
		this.disponivel = disponivel;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getFaixaEtaria() {
            return faixaEtaria;
    }

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponibilidade(boolean disponivel) {
		this.disponivel = disponivel;
	}

	public void validarDisponibilidade() {
		if (isDisponivel()) {
			System.out.println("O livro está disponível para empréstimo.");
		} else {
			System.out.println("O livro não está disponível para empréstimo.");
		}
	}

	@Override
	public void validarPublicacao() {
		System.out.println("Validando publicação de livro...");
	}
}
