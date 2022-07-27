
public class TestaGetESet {

		public static void main(String[] args) {
			Conta conta = new Conta(24226,1212);
			Conta  conta2  = new Conta(1122, 12212);
//			conta.numero = 1337;
			conta.setNumero(1337);
			System.out.println(conta.getNumero());
			System.out.println(conta2.getNumero());
			
			Cliente samuel = new Cliente();
			samuel.setNome("Samuel Carneiro Silveira");
			samuel.setCpf("1222211122121");
			samuel.setProfissao("Programmer");
			
//			samuel.titular = samuel;
			conta.setTitular(samuel);
		
			System.out.println(conta.getTitular().getNome());
			System.out.println(Conta.getTotal());
		
		}
}
