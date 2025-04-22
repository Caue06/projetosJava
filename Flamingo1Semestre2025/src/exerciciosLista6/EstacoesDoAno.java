package exerciciosLista6;

import java.util.Scanner;

public class EstacoesDoAno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número correspondente a estação do ano:\n 1 - Primavera\n 2 - Verão\n 3 - Outono\n 4 - inverno");
		int estacao = sc.nextInt();

		switch (estacao) {
		case 1:
			System.out.println("Primavera");
			break;
		case 2:
			System.out.println("Verão");
			break;
		case 3:
			System.out.println("Outono");
			break;
		case 4:
			System.out.println("Inverno");
			break;
		default:
			System.out.println("Estação inválida, tente novamente.");
			break;
		}
		sc.close();
	}

}
