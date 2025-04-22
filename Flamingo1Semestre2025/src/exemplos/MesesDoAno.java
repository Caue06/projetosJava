package exemplos;

import java.util.Scanner;

public class MesesDoAno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número correspondente ao mes do ano:");
		int mesDoAno = sc.nextInt();
		
		if (mesDoAno == 1) {
			System.out.println("Janeiro");
		} else if (mesDoAno == 2) {
			System.out.println("Fevereiro");
		} else if (mesDoAno == 3) {
			System.out.println("Março");
		} else if (mesDoAno == 4) {
			System.out.println("Abril");
		} else if (mesDoAno == 5) {
			System.out.println("Maio");
		} else if (mesDoAno == 6) {
			System.out.println("Junho");
		} else if (mesDoAno == 7) {
			System.out.println("Julho");
		} else if (mesDoAno == 8) {
			System.out.println("Agosto");
		} else if (mesDoAno == 9) {
			System.out.println("Setembro");
		} else if (mesDoAno == 10) {
			System.out.println("Outubro");
		} else if (mesDoAno == 11) {
			System.out.println("Novembro");
		} else if (mesDoAno == 12) {
			System.out.println("Dezembro");
		} else {
			System.out.println("Não há mes correspondente.");
		}
		sc.close();
	}

}
