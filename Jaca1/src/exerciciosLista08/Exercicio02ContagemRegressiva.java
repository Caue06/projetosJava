package exerciciosLista08;

import java.util.Scanner;

public class Exercicio02ContagemRegressiva {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		int numero = sc.nextInt();
		
		while(numero > 0) {
			System.out.println(numero);
			numero--;
		}
		sc.close();
	}

}
