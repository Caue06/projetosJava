package exerciciosLista1;

import java.util.Scanner;

public class Exercicio02Subtracao {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor1 = sc.nextInt();
		System.out.println("Digite outro valor: ");
		int valor2 = sc.nextInt();
		
		int resultado = valor1 - valor2;
		System.out.println("O resultado da subtração é: " + resultado);
		sc.close();
	}

}
