package exerciciosLista07;

import java.util.Scanner;

public class Exercicio12LeituraAteNegativo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		int numero = 0;
		int maiorNumero = 0;
		int menorNumero = 0;

		while (numero > -1) {
			System.out.println("Digite um numero:");
			numero = sc.nextInt();
			
			if(numero > maiorNumero) {
				maiorNumero = numero;
			}
			if(numero < menorNumero) {
				menorNumero = numero;
			}

		}
		System.out.println(maiorNumero);
		System.err.println(menorNumero);
		sc.close();
	}

}
