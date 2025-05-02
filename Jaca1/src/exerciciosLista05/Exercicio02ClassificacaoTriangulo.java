package exerciciosLista05;

import java.util.Scanner;

public class Exercicio02ClassificacaoTriangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o comprimento do primeiro lado do triangulo: ");
		float lado1 = sc.nextFloat();

		System.out.println("Digite o comprimento do segundo lado do triangulo: ");
		float lado2 = sc.nextFloat();

		System.out.println("Digite o comprimento do terceiro lado do triangulo: ");
		float lado3 = sc.nextFloat();

		if (lado1 == lado2 && lado2 == lado3) {
			System.out.println("É um Triângulo Equilátero.");
		} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			System.out.println("É um Triângulo Isóscele.");
		}else {
			System.out.println("É um Triângulo Escaleno.");
		}
		sc.close();
	}

}
