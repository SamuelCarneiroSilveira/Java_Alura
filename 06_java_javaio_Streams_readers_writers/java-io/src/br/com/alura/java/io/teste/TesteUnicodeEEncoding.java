package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String s = "ç";
		System.out.println(s.codePointAt(0));
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());
		
		byte[] bytes = s.getBytes("windows-1252");
		System.out.print(bytes.length+ " windows-1252, ");
		String sNovo= new String(bytes);
		System.out.println(sNovo);

		bytes = s.getBytes("UTF-8");
		System.out.print(bytes.length + " UTF-8, ");
		sNovo= new String(bytes);
		System.out.println(sNovo);

		bytes = s.getBytes("UTF-16");
		System.out.print(bytes.length + " UTF-16, ");
		sNovo= new String(bytes);
		System.out.println(sNovo);
		
		bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out.print(bytes.length + " ASCII, ");
		sNovo= new String(bytes);
		System.out.println(sNovo);
		
		bytes = s.getBytes(StandardCharsets.ISO_8859_1);
		System.out.print(bytes.length + " ISO, ");
		sNovo= new String(bytes);
		System.out.println(sNovo);
	}

}
