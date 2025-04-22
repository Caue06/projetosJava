package exerciciosLista4;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int numero = sc.nextInt();
		
		int resultado = numero % 2;
		
		if(resultado == 0) {
			System.out.println("O número digitado é par.");
		}else {
			System.out.println("O número digitado é impar.");
		}
		
		sc.close();
			}

}
