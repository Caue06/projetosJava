package exerciciosLista08;

import java.util.Scanner;

public class Exercicio08ContagemDeVogais {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma palavra:");
		String palavra = sc.nextLine();

		int contadoraPalavra = 0;
		int contadoraVogais = 0;
		
		palavra = palavra.toLowerCase();

		while (contadoraPalavra < palavra.length()) {
			char vogal = palavra.charAt(contadoraPalavra);
			if (vogal == 'a' || vogal == 'e' || vogal == 'i' || vogal == 'o' || vogal == 'u') {
				contadoraVogais++;
			}
			contadoraPalavra++;
		}

		System.out.println("A palavra digitada tem " + contadoraVogais + " vogais.");
		sc.close();
	}

}
