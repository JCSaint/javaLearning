package introJavaPOO;

public class CarrinhoDeCompras {
	private int total;
	
	public CarrinhoDeCompras() {
		this.total  = 0;
	}

	public int getTotal() {
		return total;
	}

	public void adiciona(Produto produto) {
		System.out.println("Adicionando: " + produto);
		
		this.total += produto.getValor();
	}
}
