package exerciciosLista4;

import java.util.Scanner;

public class Intervalo10E20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int numero = sc.nextInt();
		
		if(numero > 10 && numero < 20) {
			System.out.println("O número digitado é maior que 10 e menor que 20.");
		}else{
			System.out.println("O número digitado não é maior que 10 e menor que 20.");
		}
		sc.close();
	}

}
