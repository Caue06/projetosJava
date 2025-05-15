package exerciciosLista08;

import java.util.Scanner;

public class Exercicio06MediaDeNotas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float nota = 0;
		float media = 0;
		float numero = 0;
		
		while(nota > -1 && nota < 11) {
			System.out.println("Digite uma nota:");
			nota = sc.nextFloat();
			if(nota < 0 || nota > 10) {
				System.out.println("Número Invalido.");
				break;
			}
			media += nota;	
			numero++;
		}
		
		media /= numero;
		
		System.out.println("A média das notas é: " + media);
		sc.close();
	}

}
