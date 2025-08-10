package com.mycompany.app.Model;
import java.util.Date;

public class Emprestimo {
	private Livro livro;
	private Usuario usuario;
	private Date dataRetirada;
	private Date dataDevolucao;

	public Emprestimo(Livro livro, Usuario usuario, Date dataRetirada, Date dataDevolucao) {
		this.livro = livro;
		this.usuario = usuario;
		this.dataRetirada = dataRetirada;
		this.dataDevolucao = dataDevolucao;
	}

	public Livro getLivro() {
		return this.livro;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public Date getDataRetirada() {
		return this.dataRetirada;
	}

	public Date getDataDevolucao() {
		return this.dataDevolucao;
	}
}
