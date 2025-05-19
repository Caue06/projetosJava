package exerciciosLista09;

import java.util.Scanner;

public class Exercicio06MediaDeNotas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int contadora = 0;
		float nota = 0;
		float media = 0;

		do {
			System.out.println("Digite a nota:");
			nota = sc.nextInt();
			if(nota > -1  && nota < 11) {
				media += nota;
				contadora++;
			}
		} while (nota > -1 && nota < 11);
		
		media/=contadora;
		System.out.println("A média das notas é: " + media);
		sc.close();
	}

}
