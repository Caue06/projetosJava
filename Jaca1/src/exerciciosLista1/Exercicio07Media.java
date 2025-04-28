package exerciciosLista1;

import java.util.Scanner;

public class Exercicio07Media {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		int numero1 = sc.nextInt();
		System.out.println("Digite o segundo número:");
		int numero2 = sc.nextInt();
		System.out.println("Digite o terceiro número:");
		int numero3 = sc.nextInt();
		
		int media = (numero1 + numero2 + numero3) / 3;
		System.out.println("A média aritmética dos números escolhidos é: " + media);
		sc.close();
	}

}
