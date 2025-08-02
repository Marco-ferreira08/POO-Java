package com.mycompany.app;
import java.util.ArrayList;
import java.util.List;

public class Autor extends Pessoa {
	private String nacionalidade;

	public Autor(String nome, String nacionalidade) {
		super(nome);
		this.nacionalidade = nacionalidade;
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
}
