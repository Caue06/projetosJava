package exerciciosLista1;

import java.util.Scanner;

public class Exercicio10PerimetroCirculo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio do circulo:");
		float raio = sc.nextFloat();
		
		double perimetro = 2 * Math.PI * raio;
		
		System.out.printf("O perimetro do circulo é: %.2f" , perimetro);
		sc.close();
	}

}
