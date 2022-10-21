
public class TestaEscopo {

	public static void main(String[] args) {
		System.out.println("Testando Condicionais");
		
		int idade = 20;
		int quantidadePessoas = 3;
		
//		boolean acompanhado = quantidadePessoas >= 2;
		boolean acompanhado;

		if(quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		System.out.println("O valor de acompanhado é " + acompanhado);
		
		if (idade >= 18 && acompanhado) {  // não precisa de == true 
			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("infelizmente você não pode entrar");
		}
	}
}
