package exerciciosLista09;

import java.util.Scanner;

public class Exercicio08ContagemDeVogais {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String palavra = "";
		int contadoraPalavra = 0;
		int contadoraVogais = 0;

		do {
			System.out.println("Digite uma palavra, ou \"sair\" para encerrar");
			palavra = sc.nextLine();
			palavra = palavra.toLowerCase();
			
			if(palavra.equalsIgnoreCase("sair")) {
				break;
			}
			
			for(int contadora = 0; contadora< palavra.length();contadora++) {
				char vogal = palavra.charAt(contadoraPalavra);
				if (vogal == 'a' || vogal == 'e' || vogal == 'i' || vogal == 'o' || vogal == 'u') {
					contadoraVogais++;
				}
				contadoraPalavra++;
			}

			System.out.println("A palavra digitada tem " + contadoraVogais + " vogais.");
			
		} while (!palavra.equalsIgnoreCase("sair"));
		
		System.out.println("Programa Encerrado.");
		sc.close();
	}

}
