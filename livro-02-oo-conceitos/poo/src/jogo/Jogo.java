package jogo;

public class Jogo {
	public static void main(String[] args) {
		System.out.println("Iniciando o jogo!");

		Personagem mario = new Personagem();

		mario.setNome("Mario");
		mario.setCor("Vermelha");
		mario.setQuantidadeDeCogumelos(0);
		mario.setAltura(1.60);
		mario.setTipoFisico("Gordinho");
		mario.setPossuiBigode(true);

		mario.pular();
		mario.AtirarFogo();

	}
}
