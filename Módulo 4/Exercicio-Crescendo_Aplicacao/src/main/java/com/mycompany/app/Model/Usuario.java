package com.mycompany.app.Model;

import com.mycompany.app.Interface.AutorInterface;

public class Usuario extends Pessoa implements AutorInterface {
	private int  idade;
	private Emprestimo[] historicoEmprestimos;

	public Usuario(String nome, int idade) {
		super (nome);
		this.idade = idade;
	}

	public int getIdade() {
		return this.idade;
	}

	public Emprestimo[] getHistoricoEmprestimos() {
		return this.historicoEmprestimos;
	}

	public void setHistoricoEmprestimos(Emprestimo[] historicoEmprestimos) {
		this.historicoEmprestimos = historicoEmprestimos;
	}

	@Override
	public void publicar() {
		System.out.println("Usuário publicando...");
	}

}
