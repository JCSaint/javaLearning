package loja;

import produtos.Produto;

public class CarrinhoDeCompras {
	private int total;
	private Produto[] produtos = new Produto[10];
	private int contador = 0;
	
	public CarrinhoDeCompras() {
		this.total  = 0;
	}

	public int getTotal() {
		return total;
	}

	public void adiciona(Produto produto) {
		System.out.println("Adicionando: " + produto);
		this.produtos[contador] = produto;
		this.contador++;
		this.total += produto.getValor();
	}
}
