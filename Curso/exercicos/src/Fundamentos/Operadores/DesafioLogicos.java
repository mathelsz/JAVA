package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		// Trabalho na quinta(V ou F)
		
		//Minha tentaiva
		/*
		boolean trabalho1 = false;
		boolean trabalho2 = true;

		boolean entrega = trabalho1 && trabalho2;

		System.out.println("Vamos comprar a TV de 50'? " + entrega);
		System.out.println("Vamos comprar a TV de 32'? " + !entrega);

		if (!entrega == true) {
			System.out.println("\nNão entregou os trabalhos, por tanto nao vamos tomar sorvete");
		} 
		else {
			System.out.println("\nVamos todos tomar sorteve!!");
			}
			
			*/
		
		//Corrigido
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		// Operador Unário!
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou TV 50\"? " + comprouTV50);
		System.out.println("Comprou TV 32\"? " + comprouTV32);
		System.out.println("Comprou Sorvete? " + comprouSorvete);
		System.out.println("Mais saudável? " + maisSaudavel);
		}

	}
