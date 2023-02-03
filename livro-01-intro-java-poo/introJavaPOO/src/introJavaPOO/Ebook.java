package introJavaPOO;

public class Ebook extends Livro {
	private String waterMark;

	public Ebook(Autor autor) {
		super(autor);
	}

	public String getWaterMark() {
		return waterMark;
	}

	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}

	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		if (porcentagem > .15) {
			return false;
		}

		double valorSemDesconto = this.getValor();

		double desconto = porcentagem * valorSemDesconto;

		this.setValor(valorSemDesconto - desconto);

		return true;
	}
}
