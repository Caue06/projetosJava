package exerciciosLista08;

import java.util.Scanner;

public class Exercicio09Fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		int numero = sc.nextInt();
		
		int resultado = 1;
		
		while(numero > 0) {
			resultado = numero * resultado;
			numero--;
		}
		System.out.println("O resultado do fatorial é: " + resultado);
		sc.close();
	}

}
