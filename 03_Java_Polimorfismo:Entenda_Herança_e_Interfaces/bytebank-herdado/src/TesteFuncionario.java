
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Gerente nico = new Gerente();
		nico.setNome("Nico Steppat");
		nico.setCpf("40028922");
		nico.setSalario(2600.0);
		
		System.out.println(nico.getBonificacao());
		System.out.println(nico.getNome());
	}
}
