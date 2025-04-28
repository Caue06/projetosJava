package exerciciosLista1;

import java.util.Scanner;

public class Exercicio01Soma {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int numero1 = sc.nextInt();
		System.out.println("Digite outro número:");
		int numero2 = sc.nextInt();
		
		int resultado = numero1 + numero2;
		System.out.println("O resultado da soma é " + resultado);
		sc.close();
	}

}
