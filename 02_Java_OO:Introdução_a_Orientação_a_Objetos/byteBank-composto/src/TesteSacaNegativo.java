
public class TesteSacaNegativo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100); 
		
		// 
		/* Queremos que o saldo seja alterado apenas através de métodos
		 * não através de atribuidos
		 *
		 * Private - Não pode ser modificado nem lido
		 * Precisamos criar um método na classe que pega o saldo
		*/
		
	}
}
