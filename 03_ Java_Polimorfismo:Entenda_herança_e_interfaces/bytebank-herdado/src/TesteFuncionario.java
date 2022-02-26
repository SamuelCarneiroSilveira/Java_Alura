
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario nico = new Funcionario();
		
		nico.setName("Nico Steppat");
		nico.setCpf("3334455332-3");
		nico.setSalario(2800.0);
		
		System.out.println(nico.getName());
		System.out.println(nico.getBonificacao());
	}
}
