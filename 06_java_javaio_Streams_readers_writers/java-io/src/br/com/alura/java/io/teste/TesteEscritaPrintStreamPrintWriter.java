package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {

//		// Fluxo de entrada com arquivos
//		OutputStream fos = System.out; //new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);

//		FileWriter fw = new FileWriter("lorem2.txt");
//		BufferedWriter bw = new BufferedWriter(fw);

//		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));

		PrintWriter pw = new PrintWriter("lorem2.txt");
		
		pw.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed de eiusmod");
		pw.println();
		pw.println("aLorem ipsum dolor sit amet, consectetur adipiscing elit, sed de eiusmod");
         
		pw.close();

	}
}