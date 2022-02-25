
public class TestaClienteVeiculo {

	public static void main(String[] args) {
		Cliente Samuel = new Cliente("Samuel","18273128-05","4002 8922");
		Cliente Neto = new Cliente("guima","18273123-08","8922 8922");
		Cliente Ruan = new Cliente("Ruann","23423128-05","4002 4002");
	
		Veiculo celta = new Veiculo(2014, "Celta", "chevrolet", true, 90);
		Veiculo carrera = new Veiculo(2011, "carrera", "porche", false, 190);
		Veiculo slk50 = new Veiculo(2008, "slk 50", "mercedes", false, 150);

		SistemaAluguel netoCelta = new SistemaAluguel(Neto, celta, 10);
		SistemaAluguel samuelCarrera = new SistemaAluguel(Samuel, carrera, 10);
		SistemaAluguel ruanSlk50 = new SistemaAluguel(Ruan, slk50, 10);
		
		Cliente.getNumeroDeClientesCadastrados();
		Veiculo.getNumeroDeVeiculosCadastrados();
	}
}
