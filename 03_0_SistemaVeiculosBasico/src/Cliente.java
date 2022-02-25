
public class Cliente {
	private String telefone;
	private String nome;
	private String cpf;
	
	private static int numeroDeClientesCadastrados;

	public Cliente(String nome, String cpf, String telefone) {
		
		numeroDeClientesCadastrados++;
		
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
		
		System.out.println("*** Cliente cadastrado! ***");
		System.out.println("Nome: " + this.nome);
		System.out.println("Cpf: " + this.cpf);
		System.out.println("Telefone: " + this.telefone);
		System.out.println();
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public static void getNumeroDeClientesCadastrados() {
		System.out.println("O numero de clientes Cadastrados é: " + numeroDeClientesCadastrados);
		System.out.println();
	}

}