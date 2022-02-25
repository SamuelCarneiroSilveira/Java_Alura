public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total; // static significa, da classe, não zera quando é chamada

	
	// Construtor, rotina de especificação 	
	// o mais ideal é definir parâmetros na criação do objeto
	public Conta(int agencia, int numero) { 
		Conta.total++; // posso colocar o Conta. pois é um static
		System.out.println("Total de contas: " + total);
		
		this.agencia = agencia;
		this.numero = numero;
		
		System.out.println("Estou criando uma conta " + this.numero);
	}
	
	
	public void deposita(double valor) { // não retorna nada
		this.saldo += valor; // this se refere a essa conta!
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
		// usar o else aqui é opcional, pois se cair no
		// primeiro return ele sai da do método
	}

	public double getSaldo() {
		return this.saldo; // refactor altera para todos [shift alt T ]
	}

	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero){
		if(numero <= 0) {
			System.out.println("Erro, não pode valor menor ou igual a 0");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Não pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() { // Dessa forma posso chama o método pela Class principal
		return Conta.total;
	} // static significa que o método é da classe, não do objeto
}
