
public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("Testando Condicionais");
		int idade = 20;
		int quantidadePessoas = 3;
		
		boolean acompanhado = quantidadePessoas >= 2; // recebe true ou false

		if (idade >= 18 && acompanhado) {  // não precisa de == true 
			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("infelizmente você não pode entrar");
		}
	}
}
