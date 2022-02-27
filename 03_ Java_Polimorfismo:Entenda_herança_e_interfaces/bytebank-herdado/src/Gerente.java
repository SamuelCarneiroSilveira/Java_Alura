
// O gerente eh um Funcionario, Gerente herda da classe funcionario
public class Gerente extends Funcionario{

	
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
// reescrita, reescrevemos o mesmo método para o mãe e o filho
	public double getBonificacao() {
		return super.salario;
	}
}
