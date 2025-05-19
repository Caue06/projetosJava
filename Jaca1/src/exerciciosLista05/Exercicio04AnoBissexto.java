package exerciciosLista05;

import java.util.Scanner;

public class Exercicio04AnoBissexto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva um ano para verificar se ele e Bissexto:");
		int ano = sc.nextInt();
		
		if(ano % 100 == 0) {
			if(ano % 400 == 0) {
				System.out.println(ano + " é um ano Bissexto.");
			}else {
				System.out.println(ano + " não é um ano Bissexto.");
			}
			return;
		}
		
		if(ano % 4 == 0) {
			System.out.println(ano + " é um ano Bissexto.");
		}else {
			System.out.println(ano + " não é um ano Bissexto.");
		}
		sc.close();
		
	}

}
