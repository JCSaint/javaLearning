package produtos;

import livraria.Editora;

public class Revista implements Produto, Promocional {
	private String nome;
	private String descricao;
	private double valor;
	private Editora editora;
	
	@Override
	public String toString() {
		return "Nome: " + nome +" - " + "Descrição: " + descricao + "\n";
	}
	
	@Override
	public int compareTo(Produto outro) {
		if(this.getValor() < outro.getValor()) {
			return -1;
		}
		
		if(this.getValor() > outro.getValor()) {
			return 1;
		}
		
		return 0;
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

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public boolean aplicaDescontoDe(double porcentagem) {
		if (porcentagem > .1) {
			return false;
		}
		double desconto = this.getValor() * porcentagem;
		this.setValor(this.getValor() - desconto);
		return true;
	}

}
