package produtos;

import livraria.Autor;
import livraria.exception.AutorNuloException;

public abstract class Livro implements Produto {
	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;
	
	@Override
	public String toString() {
		return "Nome: " + nome +" - " + "Descrição: " + descricao + "\n";
	}

	public Livro(Autor autor) {
		if (autor == null) {
			throw new AutorNuloException("O autor do Livro não pode ser nulo");
		}

		this.autor = autor;
		this.isbn = "00000000000";
	}

	void adicionaValor(double valor) {
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public double retornaValor() {
		return valor;
	}

	public abstract boolean aplicaDescontoDe(double porcentagem);

	public void mostrarDetalhes() {
		System.out.println("Detalhes do livro");
		System.out.println("Nome: " + nome);
		System.out.println("Descrição: " + descricao);
		System.out.println("Valor: " + valor);
		System.out.println("ISBN: " + isbn);
		System.out.println("--");

		autor.mostrarDetalhes();
	}

	public boolean temAutor() {
		return this.autor != null;
	}

}
