package loja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import produtos.Produto;

public class CarrinhoDeCompras {
	private int total;
	private List<Produto> produtos = new ArrayList<Produto>();

	public CarrinhoDeCompras() {
		this.total = 0;
	}

	public int getTotal() {
		return total;
	}

	public void adiciona(Produto produto) {
		System.out.println("Adicionando: " + produto);

		this.produtos.add(produto);

		System.out.println("Total de itens: " + this.produtos.size());

		this.total += produto.getValor();
	}
	
	public void remove(int posicao) {
		this.produtos.remove(posicao);
	}
	
	public void imprimeCarrinho() {
		Collections.sort(this.produtos);
		
		System.out.println("-------------------");
		System.out.println("Seu carrinho:");
		for(Produto produto : produtos) {
			System.out.println(produto);
		}
		
		System.out.println("Total: R$ " + this.total);
	}

}
