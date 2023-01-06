package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteOrdenacao {

    public static void main(String[] args) {

                    Conta cc1 = new ContaCorrente(22, 33);
                    Cliente clienteCC1 = new Cliente();
                    clienteCC1.setNome("Nico");
                    cc1.setTitular(clienteCC1);
                    cc1.deposita(333.0);

                    Conta cc2 = new ContaPoupanca(22, 44);
                    Cliente clienteCC2 = new Cliente();
                    clienteCC2.setNome("Guilherme");
                    cc2.setTitular(clienteCC2);
                    cc2.deposita(444.0);

                    Conta cc3 = new ContaCorrente(22, 11);
                    Cliente clienteCC3 = new Cliente();
                    clienteCC3.setNome("Paulo");
                    cc3.setTitular(clienteCC3);
                    cc3.deposita(111.0);

                    Conta cc4 = new ContaPoupanca(22, 22);
                    Cliente clienteCC4 = new Cliente();
                    clienteCC4.setNome("Ana");
                    cc4.setTitular(clienteCC4);
                    cc4.deposita(222.0);


                    List<Conta> lista = new ArrayList<>();
                    lista.add(cc1);
                    lista.add(cc2);
                    lista.add(cc3);
                    lista.add(cc4);

                 // Para cada conta de lista
                    for (Conta conta : lista) {
                            System.out.println(conta +", "+ conta.getTitular().getNome()+", "+conta.getSaldo());
                    }
                    System.out.println("---------");

                    // Sort de acordo com o nosso método de comparação
//                    lista.sort(new TitularDaContaComparator());
//                    Collections.sort(lista);
                   lista.sort(null); 

                    for (Conta conta : lista) {
                            System.out.println(conta +", "+ conta.getTitular().getNome()+", "+conta.getSaldo());
                    }


                    }

}

class NumeroDaContaComparator implements Comparator<Conta> {

	// Agora precisamos definir o que diz se uma 
	// conta é maior do que a outra
	// Exemplo, quero comparar pelo número;
	
	// Caso forem iguais, retorna 0, 
	// caso o c1 seja menor que c2, retorna algum negativo 
	// caso o c2 seja menor que o c1, retorna algum positivo
	
    @Override
    public int compare(Conta c1, Conta c2) {
    	
    	return Integer.compare(c1.getNumero(), c2.getNumero());
    	
    	
//    		// Faz a mesma coisa <.<
//    		return c1.getNumero() - c2.getNumero();

    	
    	
//            if(c1.getNumero() < c2.getNumero()) {
//                return -1;
//            }
//
//            if(c1.getNumero() > c2.getNumero()) {
//                return 1;
//            }
//            
    }
}

class TitularDaContaComparator implements Comparator<Conta>{

	@Override
	public int compare(Conta c1, Conta c2) {
		
		String nomeC1 = c1.getTitular().getNome();
		String nomeC2 = c2.getTitular().getNome();
		
		// Como fazer uma comparação por ordem alfabética? 
		// Isso já foi feito na classe string
		
		//Esse método compara duas strings
		// Se o primeiro for maior que o segundo
		// Devolve negativo
		// Se o segundo for maior que o primeiro
		// Devolve positivo
		// Se forem iguais devolve 0;
		
		return nomeC1.compareTo(nomeC2);
	}
	
}