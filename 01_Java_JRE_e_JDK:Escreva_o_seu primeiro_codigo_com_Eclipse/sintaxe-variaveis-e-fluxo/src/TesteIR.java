
public class TesteIR {

	public static void main(String[] args) {
		
		/*
		 * De 1900.0 até 2800.0, o IR é de 7.5% e pode deduzir na declaração o valor de R$ 142
De 2800.01 até 3751.0, o IR é de 15% e pode deduzir R$ 350
De 3751.01 até 4664.00, o IR é de 22.5% e pode deduzir R$ 636
		 * */
		
		double salario = 19000.0;
		
		System.out.println("O salário a ser verificado é de " + salario);
		System.out.println("Segundo as regras da alíquota");
		
		boolean primeiro = (salario >= 1900.0 && salario <= 2800.0); 
		boolean segundo = (salario >= 2800.01 && salario <= 3751.0);
		boolean terceiro  = (salario >= 3751.01 && salario <= 4664.00);
		
		if(primeiro) {
			System.out.println("De 1900.0 até 2800.0, o IR é de 7.5%, ou seja " +(salario * 0.075) +" e pode deduzir na declaração o valor de R$ 142");
		} else if(segundo) {
			System.out.println("De 2800.01 até 3751.0, o IR é de 15%, ou seja " +(salario * 0.15) +" e pode deduzir R$ 350");
		} else if(terceiro) {
			System.out.println("De 3751.01 até 4664.00, o IR é de 22.5%, ou seja " +(salario * 0.225) +" e pode deduzir R$ 636");
		} else {
			System.out.println("Salário não se enquadra");
		}
		
		
	}
}
