package exerciciosLista01;

import java.util.Scanner;

public class Exercicio04Divisao {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		float numero1 = sc.nextFloat();
		System.out.println("Digite outro número: ");
		float numero2 = sc.nextFloat();
		
		float resultado = numero1 / numero2;
		System.out.println("O resultado da multiplicação é: " + resultado);
		sc.close();
	}
}
