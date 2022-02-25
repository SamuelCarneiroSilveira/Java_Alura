
public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta(); 
//		Essa palavra Conta não é uma conta, 
//		é uma "flexa" apontando para um objeto do tipo conta
		
//		O new cria um objeto
		
		primeiraConta.saldo = 300;
		Conta segundaConta = primeiraConta;
//		O segundo conta esta referenciando ao mesmo objeto que a primeira
//		mas como não tem um new, não está criando um outro objeto 
		
		segundaConta.saldo += 100;
		// isso altera o valor da primeiraConta também 
		System.out.println("Slado da primeira: " + primeiraConta.saldo);
	}
} 
