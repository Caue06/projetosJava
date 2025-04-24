package exerciciosLista03;

import java.util.Scanner;

public class Exercicio10CustoCarroNovo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o custo de fabrica:");
		float custoDeFarbica = sc.nextFloat();

		float distribuidor = (28 / custoDeFarbica) * 100;
		float impostos = (45 / custoDeFarbica) * 100;
		
		float custoFinal = custoDeFarbica + distribuidor + impostos;
		
		System.out.println("O valor final do carro novo é de: " + custoFinal);
		sc.close();
	}

}
