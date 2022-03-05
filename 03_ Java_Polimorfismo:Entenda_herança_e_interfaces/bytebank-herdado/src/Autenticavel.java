
//contrato Autenticavel
	//quem assina esse contrato, precisa implementar
		//metodo setSenha
		//metodo autentica
public abstract interface Autenticavel {
	
	public abstract void setSenha(int senha) ;
	
	public abstract boolean autentica(int senha) ;
}

// Não pode ter elementos, nem implementações
// Só assinam os métodos que precisam ser implementados 