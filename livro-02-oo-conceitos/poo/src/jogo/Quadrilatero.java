package jogo;

public class Quadrilatero {
	// EXEMPLO DE SOBRECARGA DE MÉTODO

	// Área do quadrado
	public double calcularArea(double lado) {
		return lado * lado;
	}

	// Área do trapézio
	public double calcularArea(double baseMaior, double baseMenor, double altura) {
		return ((baseMaior + baseMenor) * altura) / 2;
	}

	// Área do losango
	public double calcularArea(double diagonalMaior, double diagonalMenor) {
		return diagonalMaior * diagonalMenor;
	}
}
