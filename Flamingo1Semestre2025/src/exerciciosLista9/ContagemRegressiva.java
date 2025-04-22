package exerciciosLista9;

import java.util.Scanner;

class ContagemRegressiva {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		int contadora = sc.nextInt();
		
		do {
			System.out.println(contadora);
			contadora--;
		}while(contadora >= 0);
		
		sc.close();
	}

}
