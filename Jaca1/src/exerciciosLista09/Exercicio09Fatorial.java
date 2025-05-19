package exerciciosLista09;

import java.util.Scanner;

public class Exercicio09Fatorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero para ver o fatorial:");
		int numero = sc.nextInt();

		int resultado = 1;
		
		do {
			resultado *= numero;
			numero--;
		}while(numero > 0);
		
		System.out.println("O resultado do fatorial é: " + resultado);
		sc.close();
	}

}
