
// new ContaCorrente()
public class ContaCorrente extends Conta {

		public ContaCorrente(int agencia, int numero) {
			super(agencia,numero);
		}
		
		@Override  
		public boolean saca(double valor) {
			double valorAScavar = valor + 0.20;
			return super.saca(valorAScavar);
		}
}
