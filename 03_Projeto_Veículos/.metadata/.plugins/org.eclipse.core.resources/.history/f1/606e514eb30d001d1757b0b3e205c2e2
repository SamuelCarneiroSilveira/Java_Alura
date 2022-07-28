
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
		
		System.out.println("*** Cliente Cadastrado ***");
		System.out.println("Nome: " + this.nome);
		System.out.println("Cpf: " + this.cpf);
		System.out.println("Telefone: " + this.telefone);
		System.out.println();
		
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	
	public static void getNumeroDeClientesCadastrados() {
		System.out.println("O número de clientes cadastrados é: " + numeroDeClientesCadastrados);
		System.out.println();
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
