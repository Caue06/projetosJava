
package exerciciosLista05;

import java.util.Scanner;

public class Exercicio10VerificacaoDeDivisibilidade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int numero = sc.nextInt();
		
		if(numero % 3 == 0 && numero % 5 == 0) {
			System.out.println("O número digitado é divisivel por 3 e 5.");
		}else {
			System.out.println("O número digitado não é divisivel por 3 e 5.");
		}
	}

}
