package exemplos;

import java.util.Scanner;

public class ExemploJavaMathRaizQuadrada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		int numero1 = sc.nextInt();

		System.out.println("O valor da raiz quadrada é: " + Math.sqrt(numero1));		
		sc.close();
	}

}
