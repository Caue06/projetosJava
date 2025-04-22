package exerciciosLista3;

import java.util.Scanner;

public class Antecessor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
	
		numero--;
		
		System.out.println("O antecessor do número digitado é: " + numero);
		sc.close();
		}

}
