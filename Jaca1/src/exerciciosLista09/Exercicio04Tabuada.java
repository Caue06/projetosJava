package exerciciosLista09;

import java.util.Scanner;

public class Exercicio04Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contadora = 1;

		System.out.println("Digite um numero para ver sua tabuada:");
		int numero = sc.nextInt();

		do {
			System.out.println(numero + " X " + contadora + " = " + (numero * contadora));
			contadora++;
		} while (contadora < 11);
		sc.close();
	}

}
