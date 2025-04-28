package exerciciosLista3;

import java.util.Scanner;

public class Exercicio08Votos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os votos totais:");
		int votosTotais = sc.nextInt();
		System.out.println("Digite os votos brancos:");
		int votosBrancos = sc.nextInt();
		System.out.println("Digite os votos nulos:");
		int votosNulos = sc.nextInt();
		System.out.println("Digite os votos validos:");
		int votosValidos = sc.nextInt();
		
		float percentualBrancos =(float) votosBrancos / votosTotais * 100;
		float percentualNulos = (float)votosNulos / votosTotais * 100;
		float percentualValidos = (float)votosValidos / votosTotais * 100;
		
		System.out.println("Percentual Votos:");
		System.out.println("Votos Brancos: " + percentualBrancos + "%");
		System.out.println("Votos Nulos: " + percentualNulos + "%");
		System.out.println("Votos Validos: " + percentualValidos + "%");
		
		sc.close();

	}

}
