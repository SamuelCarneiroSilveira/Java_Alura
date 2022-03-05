
public class CalculadorDeImposto { // acho que por composição

	private double totalImposto; 
	
	public void registra(Tributavel t) { // Todos que assinaram o tributavel
		double valor = t.getValorImposto();
		totalImposto += valor;
	}

	public double getTotalImposto() {
		return totalImposto;
	}
}

