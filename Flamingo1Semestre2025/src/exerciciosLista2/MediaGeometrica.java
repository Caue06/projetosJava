package exerciciosLista2;

import java.util.Scanner;

public class MediaGeometrica {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor:");
		double valor1 = sc.nextDouble();
		
		System.out.println("Digite o segundo valor:");
		double valor2 = sc.nextDouble();
		
		System.out.println("Digite o terceiro valor:");
		double valor3 = sc.nextDouble();
		
		double mediaGeometrica = Math.cbrt(valor1 * valor2 * valor3);
		System.out.println("A Média Geometrica dos valor digitados é: " + mediaGeometrica);
		sc.close();
		
	}

}
