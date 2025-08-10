package com.mycompany.app.Model;
import java.util.ArrayList;
import java.util.List;

public class Autor extends Pessoa {
	private String nacionalidade;
	private boolean autorUsuario;

	public Autor(String nome, String nacionalidade, boolean autorUsuario) {
		super(nome);
		this.nacionalidade = nacionalidade;
		this.autorUsuario = autorUsuario;
	}

	public String getNacionalidade() {
		return this.nacionalidade;
	}

	public Livro[] getObrasPublicadas() {
		return super.getLivros();
	}

	public Livro[] getObrasPublicadasPorGenero(String genero) {
		List<Livro> obrasPorGenero = new ArrayList<>();

			for (Livro livro : super.getLivros()) {
			if (livro.getGenero().equalsIgnoreCase(genero)) {
				obrasPorGenero.add(livro);
			}
		}

		return obrasPorGenero.toArray(new Livro[obrasPorGenero.size()]);
	}

	public boolean isAutorUsuario() {
		return autorUsuario;
	}

	public void setAutorUsuario(boolean autorUsuario) {
		this.autorUsuario = autorUsuario;
	}
}
