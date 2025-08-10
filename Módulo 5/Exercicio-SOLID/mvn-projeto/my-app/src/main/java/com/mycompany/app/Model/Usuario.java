package com.mycompany.app.Model;

public class Usuario extends Pessoa{
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
}
