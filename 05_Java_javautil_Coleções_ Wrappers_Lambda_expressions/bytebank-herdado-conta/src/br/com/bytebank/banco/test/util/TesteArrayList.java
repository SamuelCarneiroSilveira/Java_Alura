package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta cc = new ContaCorrente(22,11);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(22,22);
		lista.add(cc2);
		
		System.out.println(lista.size());
		
		Conta ref = (Conta) lista.get(0);
		System.out.println(ref.getNumero());

		lista.remove(0); // remover o elemento na pos 0 
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta cc3 = new ContaCorrente(33,311);
		lista.add(cc3);

		Conta cc4 = new ContaCorrente(33,322);
		lista.add(cc4);
		
		for(Conta oRef : lista) { // Para cada elemento oRef(nome generico, em lista, faça)
			System.out.println(oRef);
		}
		
	}

}
