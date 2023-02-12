package poo;

public class Personagem {
	private String nome;
	private String cor;
	private int quantidadeDeCogumelos;
	private double altura;
	private String tipoFisico;
	private boolean possuiBigode;

	public Personagem() {
	}

	public void finalize() {
		// método destrutor
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void pular() {
		// implementação a ser adicionada
	}

	public void pegarCogumelo(Cogumelo cogumelo) {
		// implementação a ser adicionada
	}

	public BolaFogo AtirarFogo() {
		// implementação a ser adicionada
		return new BolaFogo();
	}

}
