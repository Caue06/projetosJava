package exerciciosLista06;

import java.util.Scanner;

public class Exercicio05CategoriaIdade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a sua idade:");
		int idade = sc.nextInt();

		int categoria = 0;

		if (idade < 12) {
			categoria = 1;
		} else if (idade > 11 && idade < 18) {
			categoria = 2;
		} else if (idade > 17 && idade < 60) {
			categoria = 3;
		} else if (idade > 59) {
			categoria = 4;
		}

		switch (categoria) {
		case 1:
			System.out.println("Criança");
			break;
		case 2:
			System.out.println("Adolescente");
			break;
		case 3:
			System.out.println("Adulto");
			break;
		case 4:
			System.out.println("Idoso");
			break;
		default:
			System.out.println("Idade Invalida, Digite novamente.");
			break;
		}
		sc.close();
	}

}
