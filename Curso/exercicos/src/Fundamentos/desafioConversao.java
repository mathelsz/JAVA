package Fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		//MINHA TENTATIVA
		
		/*	Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu ultimo salario: ");
		String salario1 = entrada.nextLine();
		
		System.out.print("Digite penultimo salario: ");
		String salario2 = entrada.nextLine();
		
		System.out.print("Digite antipenultimo salario: ");
		String salario3 = entrada.nextLine();
		
		double num1 = Double.parseDouble(salario1);
		double num2 = Double.parseDouble(salario2);
		double num3 = Double.parseDouble(salario3);
		
		double media = (num1 + num2 + num3 / 3);
		System.out.println("A sua media salarial sua dos ultimos 3 meses é: " + media);
		
		entrada.close();
		*/
			
		
		//CORRIGIDO
		Scanner entrada = new Scanner(System.in);
			
		System.out.print("Informe o primeiro salário:");
		String valor1 = entrada.next().replace(",", ".");
		
		System.out.print("Informe o segundo salário:");
		String valor2 = entrada.next().replace(",", ".");
		
		System.out.print("Informe o terceiro salário:");
		String valor3 = entrada.next().replace(",", ".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3) / 3;
		System.out.println("A média dos salários é " + media);
		
		entrada.close();
		
		}
	

}
