package exerciciosLista7;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número para ver a tabuada:");
		int numero = sc.nextInt();
		
		int contadora = 1;
				
		while(contadora < 11) {
			System.out.println(numero + " X " + contadora + " = " + (numero * contadora));
			contadora++;
		}
		sc.close();
	}

}
