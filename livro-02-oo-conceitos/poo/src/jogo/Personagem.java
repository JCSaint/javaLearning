package jogo;

public class Personagem {
	private String nome;
	private String cor;
	private int quantidadeDeCogumelos;
	private double altura;
	private String tipoFisico;
	private boolean possuiBigode;
	private static int quantidadeDeOlhos = 2;

	public Personagem() {
	}

	public static int getQuantidadeDeOlhos() {
		return Personagem.quantidadeDeOlhos;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getTipoFisico() {
		return tipoFisico;
	}

	public void setTipoFisico(String tipoFisico) {
		this.tipoFisico = tipoFisico;
	}

	public boolean isPossuiBigode() {
		return possuiBigode;
	}

	public void setPossuiBigode(boolean possuiBigode) {
		this.possuiBigode = possuiBigode;
	}

	public String getCor() {
		return cor;
	}

	public static void falar() {
		System.out.println("Estou falando!");
	}

	public void finalize() {
		// método destrutor
	}

	public int getQuantidadeDeCogumelos() {
		return quantidadeDeCogumelos;
	}

	public void setQuantidadeDeCogumelos(int quantidadeDeCogumelos) {
		this.quantidadeDeCogumelos = quantidadeDeCogumelos;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCor(String cor) {
		return this.cor;
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

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Personagem) {
			Personagem p = (Personagem) obj;
			return this.nome.equals(p.getNome());
		}

		return false;
	}

	@Override
	public String toString() {
		return "Nome do personagem: " + this.nome;
	}

}
