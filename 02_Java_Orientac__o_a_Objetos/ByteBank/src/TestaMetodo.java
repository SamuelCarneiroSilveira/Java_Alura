
public class TestaMetodo {

		public static void main(String[] args){
			Conta contaDoSamuel = new Conta();
			contaDoSamuel.saldo = 100;
			contaDoSamuel.deposita(100);
			System.out.println("O saldo do samuel é: " + contaDoSamuel.saldo);
			
			if(contaDoSamuel.saca(100)) {
				System.out.println("Saque realizado com sucesso!");
				System.out.println("Valor após o saque: "+contaDoSamuel.saldo);
			} else {
				System.out.println("Saque não realizado!");
				System.out.println("valor na conta: "+contaDoSamuel.saldo);
			}
			
			Conta contaDaBeatriz = new Conta();
			contaDaBeatriz.deposita(1000);
			
			
			if(contaDaBeatriz.transfere(300, contaDoSamuel)){
				System.out.println("Depósito realizado com sucesso!");
				System.out.println("O saldo do samuel é: " + contaDoSamuel.saldo);
				System.out.println("O saldo da beatriz é: " + contaDaBeatriz.saldo);
			} else {
				System.out.println("Depósito não realizado!");
				System.out.println("O saldo do samuel é: " + contaDoSamuel.saldo);
				System.out.println("O saldo da beatriz é: " + contaDaBeatriz.saldo);
			}
			
			contaDoSamuel.titular = "Samuel Carneiro";
			System.out.println(contaDoSamuel.titular);
		}
}
