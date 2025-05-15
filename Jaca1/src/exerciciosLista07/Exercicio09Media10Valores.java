package exerciciosLista07;

import java.util.Scanner;

public class Exercicio09Media10Valores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int contadora = 0;
		int numeracao = 1;
		int soma = 0;
		
		while (contadora < 10) {
			System.out.println("Digite o " + numeracao + "º número");
			float valor = sc.nextFloat();
			
			soma += valor;
			
			contadora++;
			numeracao++;
		}
		
		
		soma /= 10;
		
		System.out.println("Media: " + soma);
		sc.close();
		
	}

}
