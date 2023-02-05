package loja;

import java.util.HashMap;
import java.util.Map;

public class GerenciadorDeCupons {
	private Map<String, Double> cupons;

	public GerenciadorDeCupons() {
		this.cupons = new HashMap<>();
		this.cupons.put("CUPOM10", 10.0);
		this.cupons.put("CUPOM20", 20.0);

	}

	public boolean validaCupom(String cupom) {
		return this.cupons.containsKey(cupom);
	}
}
