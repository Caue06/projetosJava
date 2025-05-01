package exerciciosLista5;

import java.util.Scanner;

public class Exercicio08CategoriaDeIdade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a sua idade:");
		int idade = sc.nextInt();
		
		if(idade < 12) {
			System.out.println("Criança");
		}else if(idade > 11 && idade < 18) {
			System.out.println("Adolescente");
		}else if(idade > 17 && idade < 60) {
			System.out.println("Adulto");
		}else if(idade > 59) {
			System.out.println("Idoso");
		}
	}
}
