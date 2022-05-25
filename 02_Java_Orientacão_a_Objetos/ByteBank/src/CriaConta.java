
public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		primeiraConta.saldo += 100;
		
		System.out.println("A primeira conta tem: R$" + primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 100;
		segundaConta.saldo += 150;
		
		System.out.println("A segunda conta tem: R$" + segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia); // o valor default vem zerado
		System.out.println(primeiraConta.numero); // 
	}	
}