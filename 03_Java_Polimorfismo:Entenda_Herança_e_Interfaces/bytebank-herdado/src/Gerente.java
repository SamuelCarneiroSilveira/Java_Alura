// O gerente [é um/herda de um] funcionário
public class Gerente extends Funcionario {

	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario(); // Está chamando a 
													  //bonificaćão do método mãe, usando super
	}
}
