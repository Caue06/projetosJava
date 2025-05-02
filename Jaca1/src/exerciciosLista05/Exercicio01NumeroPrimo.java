package exerciciosLista05;

import java.util.Scanner;

public class Exercicio01NumeroPrimo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		int numero = sc.nextInt();
		
		if(numero == 2) {
			System.out.println("Esse número é primo.");
			return;
		}

		if (numero < 2 || numero % 2 == 0) {
			System.out.println("Esse numero não é primo.");
			return;
		}

		for (int contadora = 2; contadora < Math.sqrt(numero); contadora++) {
			if (numero % contadora == 0) {
				System.out.println("Esse número não é primo.");
				return;
			}
		}
		System.out.println("Esse número é primo.");
		sc.close();
	}

}
