package exerciciosLista03;

import java.util.Scanner;

public class Sucessor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero para ver o seu sucessor:");
		int numero = sc.nextInt();
		
		numero++;
		
		System.out.println("O sucessor do numero digitado é: " + numero);
		sc.close();
	}

}
