public class Conta{
	private double saldo; // atributos, propriedades e campos 
	int agencia; 
	int numero;
	Cliente titular; 
	

	
	public void deposita(double valor){ // não retorna nada
		this.saldo += valor; // this se refere a essa conta! 
	}
	
	public boolean saca(double valor){
		if(this.saldo >= valor) {
		this.saldo -= valor;
		return true;
		} else {
		return false;
		}
	}
	
    public boolean transfere(double valor, Conta destino){
    	if(this.saldo >= valor) {
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
}

