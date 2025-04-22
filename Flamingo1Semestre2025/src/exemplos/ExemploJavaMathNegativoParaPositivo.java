package exemplos;

import java.util.Scanner;

public class ExemploJavaMathNegativoParaPositivo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		float numero1 = sc.nextInt();

		System.out.println("O valor positivo do valor digitado é: " + Math.abs(numero1));		
		sc.close();
	}

}
