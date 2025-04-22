package exerciciosLista03;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio do circulo:");
		float raio = sc.nextFloat();
		
		double area = Math.PI * raio * raio;
		
		System.out.printf("A area do circulo é: %.2f" , area);
		sc.close();
		
	}

}
