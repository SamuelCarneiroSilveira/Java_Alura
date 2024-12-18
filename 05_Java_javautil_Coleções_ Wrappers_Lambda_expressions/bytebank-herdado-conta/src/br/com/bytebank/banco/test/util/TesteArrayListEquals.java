package br.com.bytebank.banco.test.util;

import java.util.LinkedList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {

//		 Conta cc1 = new ContaCorrente(22,22);
//		 Conta cc2 = new ContaCorrente(22,22);
//		 
//		 boolean igual = cc1.ehIgual(cc2);
//		 System.out.println(igual);

		// Generics
		LinkedList<Conta> lista = new LinkedList<Conta>();

		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);

		Conta cc3 = new ContaCorrente(22, 22);
		boolean existe = lista.contains(cc3);

		System.out.println(existe);

		for (Conta oRef : lista) { // Para cada elemento oRef(nome generico, em lista, faça)
			System.out.println(oRef);
		}

	}

}
