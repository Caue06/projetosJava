package exerciciosLista08;

import java.util.Scanner;

public class Exercicio03SomaNumerosPositivos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = 0;
		int soma = 0;
		
		while(numero > -1) {
			System.out.println("Digite um numero:");
			numero = sc.nextInt();
			if(numero < 0) {
				break;
			}
			soma += numero;
		}
		System.out.println(soma);
		sc.close();
	}

}
