package exemplos;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out
				.println("Selecione um opção: \n 1 - Administração\n 2 - Pedagogia\n 3 - Recursos Humanos\n 4 - Sair");
		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Parabéns - Você escolheu o curso de Administração");
			break;
		case 2:
			System.out.println("Parabéns - Você escolheu o curso de Pedagogia");
			break;
		case 3:
			System.out.println("Parabéns - Você escolheu o curso de Recursos Humanos");
			break;
		default:
			System.out.println("Escolha inválida");
			break;
		}
		sc.close();
	}
}
