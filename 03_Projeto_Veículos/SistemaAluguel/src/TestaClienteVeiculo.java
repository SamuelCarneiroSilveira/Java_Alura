
public class TestaClienteVeiculo {

	public static void main(String[] args) {
		Cliente Samuel = new Cliente("Samuel","19328429384-09", "4002-8922");
		Cliente Neto = new Cliente("Neto","983476529-98","3838-9393");
		
		Veiculo celta = new Veiculo(2018,"Celta","Chevrolet", false, 90);
		Veiculo gol = new Veiculo(2020, "Gol", "volkswagen", true, 140);
		
		SistemaAluguel SamuelGol = new SistemaAluguel(Samuel, gol, 10);
		SistemaAluguel NetoCelta = new SistemaAluguel(Neto, celta, 10);
		
		Cliente.getNumeroDeClientesCadastrados();
		Veiculo.getNumeroDeVeiculosCadastrados();
	}
}
