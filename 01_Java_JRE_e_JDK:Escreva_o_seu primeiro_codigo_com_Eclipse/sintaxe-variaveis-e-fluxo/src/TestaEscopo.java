
public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("Testando Condicionais");
		
		int age = 20;
		int numberOfPeople = 3;
		
		boolean accompanied = numberOfPeople >= 2;
		
		
		
		if (age >= 18 && accompanied) {  // não precisa de == true 
			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("infelizmente você não pode entrar");
		}
	}
}
