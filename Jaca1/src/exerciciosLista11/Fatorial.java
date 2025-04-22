package exerciciosLista11;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero para ver o seu fatorial:");
		int numeroFatorial = sc.nextInt();
		
		int resultado = 1; 

		for (numeroFatorial = numeroFatorial ;numeroFatorial > 0; numeroFatorial--) {
			resultado = resultado * numeroFatorial;
			
		}
		System.out.println(resultado);
	}	

}
