package exemplos;

import java.util.Scanner;

public class ExemploJavaMathMaxMin {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite um valor:");
		int numero1 = sc.nextInt();
		System.out.println("Digite outro valor:");
		int numero2 = sc.nextInt();
		
		
		System.out.println("O maior valor digitado pelo cliente é: " + Math.max(numero1,numero2));
		System.out.println("O menor valor digitado pelo cliente é: " + Math.min(numero1, numero2));
		
		sc.close();

	}

}
