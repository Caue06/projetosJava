package exerciciosLista03;

import java.util.Scanner;

public class Exercicio04AreaTriangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a base do triangulo:");
		float base = sc.nextFloat();
		
		System.out.println("Digite a altura do triangulo:");
		float altura = sc.nextFloat();
		
		float area = base * altura / 2;
		
		System.out.println("A area do triangulo é: " + area);
		sc.close();
	}

}
