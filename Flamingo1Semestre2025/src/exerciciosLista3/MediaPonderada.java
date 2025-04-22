package exerciciosLista3;

import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota.");
		float nota1 = sc.nextFloat();
		System.out.println("Digite a segunda nota.");
		float nota2 = sc.nextFloat();
		System.out.println("Digite a terceira nota.");
		float nota3 = sc.nextFloat();
		
		float mediaFinal = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
		System.out.println("A nota final é: " + mediaFinal);
		sc.close();
		}

}
