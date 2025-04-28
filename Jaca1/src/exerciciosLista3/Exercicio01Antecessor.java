package exerciciosLista3;

import java.util.Scanner;

public class Exercicio01Antecessor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero para ver o seu antecessor:");
		int numero = sc.nextInt();
		
		numero--;
		
		System.out.println("O antecessor do numero digitado é: " + numero);
		sc.close();
	}

}
