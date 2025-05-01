package exerciciosLista5;

import java.util.Scanner;

public class Exercicio07NotaEConceito {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a nota de 0 a 100:");
		int nota = sc.nextInt();

		if (nota > 89 && nota < 100) {
			System.out.println("Nota A");
		} else if (nota > 79 && nota < 90) {
			System.out.println("Nota B");
		} else if (nota > 69 && nota < 80) {
			System.out.println("Nota C");
		} else if (nota > 59 && nota < 70) {
			System.out.println("Nota D");
		} else {
			System.out.println("Nota F");
		}
		
		sc.close();
	}

}
