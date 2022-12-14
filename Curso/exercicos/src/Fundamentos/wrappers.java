package fundamentos;

import java.util.Scanner;

public class Wrappers {
	public static void main(String[] args) {

		// Integer o = Integer.parseInt(entrada.next());

		// byte
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000; // Primitivo: int
		Long l = 100000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(l / 3);
		
		Float f = 123.0F;
		System.out.println(f);
		
		Double d = 123.567;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo.toString().toUpperCase());
		
		//char
		Character c = '#';
		System.out.println(c);
		
		
		/*
		   Todo tipo primitivo no java tem sua versão orintada a objeto,
		 	que se chama wrapper que nada mais é seu nome como primitivo 
		 	com a letra maiuscula na frente em vez de minuscula 
		 	
		 	exceto 
		 	 	char -> Character
		 	 	int -> Integer
		 */

	}

}
