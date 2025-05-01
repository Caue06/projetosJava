package exerciciosLista5;

import java.util.Scanner;

public class Exercicio09SinalDeNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		int numero = sc.nextInt();
		
		if(numero > 0) {
			System.out.println("O número digitado é positivo.");
		}else if(numero < 0) {
			System.out.println("O número digitado é negativo.");
		}else {
			System.out.println("O número digitado é 0.");
		}
	}

}
