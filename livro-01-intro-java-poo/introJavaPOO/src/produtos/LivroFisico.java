package produtos;

import livraria.Autor;

public class LivroFisico extends Livro implements Promocional, Produto {

	public LivroFisico(Autor autor) {
		super(autor);

	}

	public double getTaxaImpressao() {
		return this.getValor() * 0.05;
	}

	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		if (porcentagem > .30) {
			return false;
		}

		double valorSemDesconto = this.getValor();

		double desconto = porcentagem * valorSemDesconto;

		this.setValor(valorSemDesconto - desconto);

		return true;
	}

}
