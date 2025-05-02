package exerciciosLista01;

import java.util.Scanner;

public class Exercicio06QuadradoNumero {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		
		int quadrado = numero * numero;
		System.out.println("O quadrado do número digitado é: " + quadrado);
		sc.close();
	}
}
