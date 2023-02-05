package loja;

public class ConsultaDeDescontos {
	private GerenciadorDeCupons gerenciadorDeCupons;

	ConsultaDeDescontos() {
		this.gerenciadorDeCupons = new GerenciadorDeCupons();
	}
	
	void consultar(String cupom) {
		if(this.gerenciadorDeCupons.validaCupom(cupom)) {
			System.out.println("Cupom de desconto válido");
			return;
		}
		
		System.out.println("Cupom inválido ou não existe");
	}
}
