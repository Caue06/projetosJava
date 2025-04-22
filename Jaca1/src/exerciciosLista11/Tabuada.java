package exerciciosLista11;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número para ver a sua tabuada:");
		int numero = sc.nextInt();

		for (int contadora = 1; contadora < 11; contadora++) {
			int resultado = numero * contadora;
			System.out.println(numero + " X " + contadora + " = " + resultado);
		}

		sc.close();
	}

}
