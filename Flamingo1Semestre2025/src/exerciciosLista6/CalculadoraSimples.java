package exerciciosLista6;

import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		float numero1 = sc.nextFloat();
				
		System.out.println("Digite outro número:");
		float numero2 = sc.nextFloat();

		System.out.println("Qual operação dejesa fazer:\n 1 - Adição\n 2 - Subtração\n 3 - Multiplicação\n 4 - Divisão");
		int operacao = sc.nextInt();
		
		float resultado;

		switch (operacao) {
		case 1:
			resultado = numero1 + numero2;
			System.out.println("O resultado da Adição é: " + resultado);
			break;
		case 2:
			resultado = numero1 - numero2;
			System.out.println("O resultado da Subtração é: " + resultado);
			break;
		case 3:
			resultado = numero1 * numero2;
			System.out.println("O resultado da Multiplicação é: " + resultado);
			break;
		case 4:
			resultado = numero1 / numero2;
			System.out.println("O resultado da Divisão é: " + resultado);
			break;
		default:
			System.out.println("Operação inválida, tente novamente.");
			break;
		}
		sc.close();
	}

}
