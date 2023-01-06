package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
//import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestArrayReferencias {
	
	public static void main(String[] args) {
		
		//int[] idades = new int[5];
		Object[] ref = new Object[5];
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		ref[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(22, 22);
		ref[1] = cc2;	
		
		Cliente cliente = new Cliente();
		ref[2] = cliente;
		
		//System.out.println(cc2.getNumero());

		
		ContaPoupanca refere =  (ContaPoupanca)ref[1]; // cast de referências
		System.out.println(cc2.getNumero());
		System.out.println(refere.getNumero());
		
	}

}
