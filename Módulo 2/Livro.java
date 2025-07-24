public class Livro {
	private String titulo;
	private Autor autor;
	private String genero;
	private int faixaEtaria;
	private boolean disponibilidade;

	public Livro(String titulo, Autor autor, String genero, int faixaEtaria) {
		this.titulo =  titulo;
		this.autor = autor;
		this.genero = genero;
		this.faixaEtaria = faixaEtaria;
		this.disponibilidade = true;
	}

	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
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
		if (disponibilidade == true) {
			return true;
		} else {
			return false;
		}
	}

	public void validarDisponibilidade() {
		if (isDisponivel()) {
			System.out.println("O livro está disponível para empréstimo.");
		} else {
			System.out.println("O livro não está disponível para empréstimo.");
		}
	}
}