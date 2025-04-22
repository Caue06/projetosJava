package exerciciosLista4;

import java.util.Scanner;

public class DivisivelPor3E5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int numero = sc.nextInt();
		
		int divisivelPor3 = numero % 3;
		
		int divisivelPor5 = numero % 5;
		
		if(divisivelPor3 == 0 && divisivelPor5 == 0) {
			System.out.println("O número digitado é divisivel por 3 e por 5.");
		}else {
			System.out.println("O número digitado não é divisivel por 3 e por 5.");
		}
		sc.close();

	}

}
