package exerciciosLista07;

import java.util.Scanner;

public class Exercicio06Potencia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da base:");
		int base = sc.nextInt();
		System.out.println("Digite o valor do expoente:");
		int expoente = sc.nextInt();
		
		int contadora = 0;
		int acumuladora = 1;
		
		while(contadora < expoente) {
			acumuladora *=base;
			contadora++;
		}
		
		System.out.println("O resultado da potencia é: " + acumuladora);
		sc.close();
	}

}
