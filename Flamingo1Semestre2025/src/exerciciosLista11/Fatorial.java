package exerciciosLista11;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero para ver o seu fatorial:");
		
		int numeroFatorial = sc.nextInt();

		int multiplicador = 1;

		for (int numero = 1; numero < numeroFatorial + 1; numero++) {
			multiplicador = multiplicador * numero;
		}
		
		System.out.println(numeroFatorial + "!" + " = " + multiplicador);
		
		sc.close();

	}
}
