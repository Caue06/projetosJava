package exerciciosLista3;

import java.util.Scanner;

public class Exercicio05AreaQuadrado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o lado do quadrado:");
		float lado = sc.nextFloat();
		
		float area = lado * lado;
		
		System.out.println("A area do quadrado é: " + area);
		sc.close();	
	}

}
