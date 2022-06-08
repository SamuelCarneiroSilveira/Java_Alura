// O gerente [é um/herda de um] funcionário
public class EditorDeVideo extends Funcionario {


	public double getBonificacao() {
		return super.getBonificacao() + 100;
		// Está chamando a bonificaćão do método mãe, usando super
	}
}
