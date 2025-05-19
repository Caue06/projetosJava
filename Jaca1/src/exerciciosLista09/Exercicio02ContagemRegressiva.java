package exerciciosLista09;

import java.util.Scanner;

public class Exercicio02ContagemRegressiva {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Contagem Regressiva");
		
		System.out.println("Digite um numero:");
		int numero = sc.nextInt();
		
		do {
			System.out.println(numero);
			numero--;
		}while(numero > -1);
		sc.close();
	}

}
