package exerciciosLista4;

import java.util.Scanner;

public class TrianguloValido {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro lado do triângulo:");
		float lado1 = sc.nextFloat();
		System.out.println("Digite o segundo lado do triângulo:");
		float lado2 = sc.nextFloat();
		System.out.println("Digite o terceiro lado do triângulo:");
		float lado3 = sc.nextFloat();
		
		float somaLados = lado1 + lado2;
		
		if (somaLados > lado3) {
			System.out.println("O triângulo é valido.");
		}else{
			System.out.println("O triângulo é invalido.");
		}
		sc.close();
	}

}
