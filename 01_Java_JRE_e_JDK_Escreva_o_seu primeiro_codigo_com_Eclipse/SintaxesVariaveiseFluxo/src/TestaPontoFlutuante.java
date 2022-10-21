
public class TestaPontoFlutuante{
	public static void main(String[] args) {
		double salario;
		salario = 1250.70;
		
		System.out.println("O meu salário é: " + salario);
		
		int divisao;
		divisao = 5/2; // resultado é 2
		
		double divisaoDouble = 5/2; // o resultado é 2.0
		
		double divisaoDeDouble = 5.0/2; // agora sim, resultado 2.5
		
		System.out.println("A divisão de dois inteiros: " + divisao);
		System.out.println("A divisão de inteiro por inteiro, em double: " + divisaoDouble);
		System.out.println("A divisão de double por inteiro: " + divisaoDeDouble);
		
	}
}