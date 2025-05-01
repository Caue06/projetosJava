package exerciciosLista5;

import java.util.Scanner;

public class Exercicio06ParidadePositividade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		int numero = sc.nextInt();
		
		if(numero > 0) {
			System.out.print("O seu número é positivo e ");
		}else if(numero < 0) {
			System.out.print("O seu número é negativo e ");
		}else {
			System.out.print("O seu número é zero e ");
		}
		
		if (numero % 2 == 0) {
			System.out.print("par.");
		}else {
			System.out.print("impar.");
		}
	}

}
