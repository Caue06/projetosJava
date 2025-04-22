package exerciciosLista4;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um ano:");
		int ano = sc.nextInt();
		
		int anoBissexto = ano % 4;
		
		if(anoBissexto == 0) {
			System.out.println("O ano " + ano + " é um ano bissexto.");
		}else {
			System.out.println("O ano " + ano + " não é uma ano bissexto.");
		}
		sc.close();
	}

}
