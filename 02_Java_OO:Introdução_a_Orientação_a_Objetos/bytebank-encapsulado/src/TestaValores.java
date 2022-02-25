
public class TestaValores {

	public static void main(String[] args){

		
		Conta conta = new Conta(2337, 24226);
		Conta conta2 = new Conta(2463, 234234);
		Conta conta22 = new Conta(2463, 234234);
		System.out.println(conta.getAgencia());
		
		System.out.println(Conta.getTotal());
	}
}
