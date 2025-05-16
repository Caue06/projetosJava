package exercicioLista09;

import java.util.Scanner;

public class Exercicio03SomaDeNumeroPositivos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero = 0;
		int soma = 0;
		do {
			System.out.println("Digite um numero:");
			numero = sc.nextInt();
			
			if(numero > -1) {
				soma += numero;
			}
		} while (numero > -1);

		System.out.println("A soma dos numeros digitados é: " + soma);
	}

}
