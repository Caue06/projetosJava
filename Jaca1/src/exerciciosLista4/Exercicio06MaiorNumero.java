package exerciciosLista4;

import java.util.Scanner;

public class Exercicio06MaiorNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro numero: ");
		float numero1 = sc.nextFloat();

		System.out.println("Digite o segundo numero: ");
		float numero2 = sc.nextFloat();

		System.out.println("Digite o terceiro numero: ");
		float numero3 = sc.nextFloat();

		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("O numero " + numero1 + " è maior que os numeros " + numero2 + " e " + numero3);
		} else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println("O numero " + numero2 + " è maior que os numeros " + numero1 + " e " + numero3);
		} else {
			System.out.println("O numero " + numero3 + " è maior que os numeros " + numero1 + " e " + numero2);

		}
		sc.close();
	}
}
