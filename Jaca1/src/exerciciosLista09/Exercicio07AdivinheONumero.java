package exerciciosLista09;

import java.util.Scanner;

public class Exercicio07AdivinheONumero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double numeroAleatorio = Math.floor(Math.random() * 10) + 1;
		int numero =0;
		
		System.out.println("Adivinhe o numero de 1 a 10");
		
		do{
			System.out.println(numeroAleatorio);
			System.out.println("Digite o numero:");
			numero = sc.nextInt();
		}
		while(numeroAleatorio != numero);
		
		System.out.println("Acertou!! O numero era " + numeroAleatorio);
		sc.close();
	}

}
