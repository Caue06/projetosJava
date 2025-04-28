package exerciciosLista3;

import java.util.Scanner;

public class Exercicio07IdadeEmDias {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a sua idade expressa em anos:");
		int anos = sc.nextInt();
		System.out.println("Digite a quantidade de dias que passou do seu aniversario:");
		int meses = sc.nextInt();
		System.out.println("Digite a quantidade de dias que passou do seu mesversario");
		int dias = sc.nextInt();
		
		int diasVividos = anos * 365 + meses * 30 + dias;
		
		System.out.println("Dias Vividos: " + diasVividos + " dias.");
		sc.close();
	}

}
