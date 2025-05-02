package exerciciosLista06;

import java.util.Scanner;

public class Exercicio06TipoDeTriangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o comprimento do primeiro lado do triangulo: ");
		float lado1 = sc.nextFloat();

		System.out.println("Digite o comprimento do segundo lado do triangulo: ");
		float lado2 = sc.nextFloat();

		System.out.println("Digite o comprimento do terceiro lado do triangulo: ");
		float lado3 = sc.nextFloat();
		
		int tipoTriangulo = 0;

		if (lado1 == lado2 && lado2 == lado3) {
			tipoTriangulo = 1;
		} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			tipoTriangulo = 2;
		}else {
			tipoTriangulo = 3;
		}
		
		switch (tipoTriangulo) {
		case 1:
			System.out.println("É um Triângulo Equilátero.");
			break;
		case 2:
			System.out.println("É um Triângulo Isóscele.");
			break;
		case 3:
			System.out.println("É um Triângulo Escaleno.");
			break;
			default:
				System.out.println("Triângulo Invalido.");
		}
		sc.close();
	}

}
