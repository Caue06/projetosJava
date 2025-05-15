package exerciciosLista07;

import java.util.Scanner;

public class Exercicio11AreaResidencial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String resposta = "SIM";
		float areaTotal = 0;

		while (resposta.equalsIgnoreCase("SIM")) {

			System.out.println("Digite o nome do comodo:");
			String nomeComodo = sc.nextLine();

			System.out.println("Digite a largura do comodo:");
			float largura = sc.nextFloat();

			System.out.println("Digite o comprimento do comodd:");
			float comprimento = sc.nextFloat();
			sc.nextLine();

			float area = largura * comprimento;
			areaTotal += area;
			
			System.out.println("Area do(a) " + nomeComodo + " é: " + area + "m²");

			System.out.println("Deseja continuar a calcular a area da sua residencia? (sim/nao)");
			resposta = sc.nextLine();
		}
		
		System.out.println("A area total de sua residencia é " + areaTotal + "m²");
		sc.close();
	}
}
