package controle;

import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a media do aulo: ");
		double media = entrada.nextDouble();
		
		if(media <= 10 && media >= 7.0) {
			System.out.println("Aluno Aprovado");
			System.out.println("Parabens!");
		}
		
		if(media < 7 && media >= 4.5) {
			System.out.println("Recuperação");
		}
		
		if(media <4.5 && media >= 0) {
			System.out.println("Reprovado");
		}
		entrada.close();
	}

}
