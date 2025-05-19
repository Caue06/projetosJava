package exerciciosLista08;

import java.util.Scanner;

public class Exercicio10SenhaCorreta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite sua senha:");
		String senhaCorreta = sc.nextLine();

		String senhaDigitada = "";

		while (!senhaDigitada.equals(senhaCorreta)) {
			System.out.println("Digite sua senha novamente:");
			senhaDigitada = sc.nextLine();
		}

		System.out.println("Senha Correta!");
		sc.close();
	}

}
