
public class Veiculo {
	private String modelo;
	private String marca;
	private boolean ehFlex;
	private double valorPorDia;
	private int ano;
	private static int numeroDeVeiculosCadastrados;

	// Construtor, Rotina de especificação
	public Veiculo(int ano, String modelo, String marca, boolean ehFlex, double valorPorDia) {
		numeroDeVeiculosCadastrados++;
		
		this.ano = ano;
		this.modelo = modelo;
		this.marca = marca;
		this.ehFlex = ehFlex;
		this.valorPorDia = valorPorDia;

		System.out.println("*** Veículo cadastradado! ***");
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Marca: " + this.marca);
		System.out.println("Ano: " + this.ano);
		System.out.println("É flex: " + this.ehFlex);
		System.out.println("Valor Diária: " + this.valorPorDia);
		System.out.println();
		
	}

	public int getAno() {
		return ano;
	}

	public String getModelo() {
		return modelo;
	}

	public String getMarca() {
		return marca;
	}

	public boolean getEhFlex() {
		return ehFlex;
	}

	public double getValorPorDia() {
		return valorPorDia;
	}

	public void setValorPorDia(double valor) {
		this.valorPorDia = valor;
	}
	
	public static void getNumeroDeVeiculosCadastrados() {
		System.out.println("O numero de veiculos cadastrados é: " + numeroDeVeiculosCadastrados);
		System.out.println();
	}
}
