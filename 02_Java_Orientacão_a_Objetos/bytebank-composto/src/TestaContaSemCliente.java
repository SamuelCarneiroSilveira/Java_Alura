
public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();
		
		contaDaMarcela.titular = new Cliente(); // Criando um novo objeto cliente
		
		
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDaMarcela.titular);
		System.out.println(contaDaMarcela.titular.nome);
		// null, uma referência que nunca foi populada
		
		contaDaMarcela.titular.nome = "Marcela";
		System.out.println(contaDaMarcela.titular.nome);
		
//		Em alguns casos faz sentido criar um objeto do tipo cliente
//		toda vez que criar uma conta nova, no nosso caso espećifico isso
//		não seria certo
	}
}
