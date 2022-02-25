
public class SistemaAluguel {
	private Cliente responsavelPeloAluguel;
	private Veiculo veiculoAlugado;
	private int numeroDeDias;
	private double valorDevido;
	
	SistemaAluguel(Cliente cliente, Veiculo veiculo, int numeroDeDias){
		this.responsavelPeloAluguel = cliente;
		this.veiculoAlugado = veiculo;
		this.numeroDeDias = numeroDeDias;
		
		this.valorDevido = (this.numeroDeDias * this.veiculoAlugado.getValorPorDia());
		
		System.out.println("*** Aluguel cadastrado com sucesso! ***");
		System.out.println("Veiculo: "+ veiculoAlugado.getModelo() + " ano " + veiculoAlugado.getAno());
		System.out.println("Marca: "+veiculoAlugado.getMarca());
		System.out.println("Dias alugado: "+ this.numeroDeDias + " Dias");
		System.out.println("Cliente: " + responsavelPeloAluguel.getNome());
		System.out.println("CPF n°: " + responsavelPeloAluguel.getCpf());
		System.out.println("Por um valor de: " + valorDevido);
		System.out.println();
	}
}

