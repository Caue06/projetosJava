package exerciciosLista11;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero para ver a sua tabuada:");
		int numero = sc.nextInt();

		int contadora = 1;

		for (contadora = contadora; contadora < 11; contadora++) {
			int resultado = contadora * numero;
			System.out.println(numero + " X " + contadora + " = " + resultado);
		}
		sc.close();
	}
}
