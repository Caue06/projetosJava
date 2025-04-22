package exerciciosLista4;

import java.util.Scanner;

public class VerificacaoSinalNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		int valor = sc.nextInt();
		
		if(valor > 0) {
			System.out.println("Seu valor é Positivo");
		}else if(valor < 0) {
			System.out.println("Seu valor é Negativo");
		}else {
			System.out.println("Seu valor é igual a 0");
		}
		sc.close();
	}

}
