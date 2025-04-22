package exerciciosLista6;

import java.util.Scanner;

public class MesesEstacoesDoAno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número correspondente ao mes do ano:");
		int mesDoAno = sc.nextInt();

		switch (mesDoAno) {
		case 1:
			System.out.println("Janeiro, Verão");
			break;
		case 2:
			System.out.println("Fevereiro, Verão");
			break;
		case 3:
			System.out.println("Março, Verão");
			break;
		case 4:
			System.out.println("Abril, Outono");
			break;
		case 5:
			System.out.println("Maio, Outono");
			break;
		case 6:
			System.out.println("Junho, Outono");
			break;
		case 7:
			System.out.println("Julho, Inverno");
			break;
		case 8:
			System.out.println("Agosto, Inverno");
			break;
		case 9:
			System.out.println("Setembro, Inverno");
			break;
		case 10:
			System.out.println("Outubro, Primavera");
			break;
		case 11:
			System.out.println("Novembro, Primavera");
			break;
		case 12:
			System.out.println("Dezembro, Verão");
			break;
		default:
			System.out.println("Não há mes correspondente");
		}
		sc.close();
	}

}
