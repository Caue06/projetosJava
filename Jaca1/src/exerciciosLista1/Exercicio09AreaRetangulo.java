package exerciciosLista1;

import java.util.Scanner;

public class Exercicio09AreaRetangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a largura do retângulo:");
		float largura = sc.nextFloat();
		System.out.println("Digite a base do retângulo:");
		float base = sc.nextFloat();
		
		float area = base * largura;
		System.out.println("A área do retângulo é: " + area + " cm²");
		sc.close();
	}

}
