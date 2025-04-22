package exerciciosLista3;

import java.util.Scanner;

public class Sucessor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
	
		numero++;
		
		System.out.println("O sucessor do número digitado é: " + numero);
		sc.close();
		}

}
