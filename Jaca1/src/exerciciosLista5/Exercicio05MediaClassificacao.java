package exerciciosLista5;

import java.util.Scanner;

public class Exercicio05MediaClassificacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota:");
		float nota1 = sc.nextFloat();
		
		System.out.println("Digite a segunda nota:");
		float nota2 = sc.nextFloat();
		
		System.out.println("Digite a terceira nota:");
		float nota3 = sc.nextFloat();
		
		float media = (nota1 + nota2 + nota3) / 3;
		
		if(media > 4) {
			System.out.println("Aprovado");
		}else if(media < 4 ) {
			System.out.println("Reprovado");
		}else {
			System.out.println("Recuperação");
		}
	}

}
