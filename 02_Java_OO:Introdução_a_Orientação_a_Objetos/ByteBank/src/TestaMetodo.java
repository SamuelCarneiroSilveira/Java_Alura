
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoSamuel = new Conta();
		contaDoSamuel.saldo = 100;
		contaDoSamuel.deposita(100);
			
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		System.out.println(contaDoSamuel.saldo);
		System.out.println(contaDaMarcela.saldo);		
		
		if(contaDaMarcela.transfere(1200, contaDoSamuel)) 
			System.out.println("Transferencia feita com sucesso");			
		else
			System.out.println("Transferencia não realizada ");
		
		System.out.println(contaDoSamuel.saldo);
		System.out.println(contaDaMarcela.saldo);
		
		contaDoSamuel.titular = "Samuel Carneiro Silveira";
		System.out.println(contaDoSamuel.titular);
		
	}
}
