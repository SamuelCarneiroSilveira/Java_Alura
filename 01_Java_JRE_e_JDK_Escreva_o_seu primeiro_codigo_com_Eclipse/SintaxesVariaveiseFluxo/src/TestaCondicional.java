
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 17;
		int quantidadePessoas = 3;
		if (idade >= 18) {
			System.out.println("Você é maior de idade");
			System.out.println("Seja bem vindo!");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Você é menor de idade, mas pode entrar pois está acompanhado");
				System.out.println("Seja bem vindo!");
			} else {
				System.out.println("Você é menor de idade");
				System.out.println("Infelizmente você não pode entrar");
			}
		}
	}
}
