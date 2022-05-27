
public class TestaBanco {

	public static void main(String[] args) {
		Cliente samuel = new Cliente();
		samuel.nome = "Samuel Carneiro";
		samuel.cpf = "612.233.08";
		samuel.profissao = "programador";
		
		Conta contaDoSamuel = new Conta();
		contaDoSamuel.titular = samuel;
		contaDoSamuel.deposita(100);
				
		System.out.println(contaDoSamuel.titular.nome);
	}
}
