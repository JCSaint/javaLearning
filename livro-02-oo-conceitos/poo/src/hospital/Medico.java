package hospital;

public abstract class Medico extends Funcionario {
	String CRM;

	public void operar() {
		System.out.println("Realizado procedimento cirúrgico!");
	}
}
