package exerciciosLista03;

import java.util.Scanner;

public class Exercicio13MediaPonderada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a primeira nota:");
		float primeiraNota = sc.nextFloat();

		System.out.println("Digite a segunda nota:");
		float segundaNota = sc.nextFloat();

		System.out.println("Digite a terceira nota:");
		float terceiraNota = sc.nextFloat();
//		 mediafinal = (n1 * 2 + n2 * 3 + n3 * 5)/10

		float mediaFinal = (primeiraNota * 2 + segundaNota * 3 + terceiraNota * 5) / 10;

		System.out.println("A media final é: " + mediaFinal);

	}

}
