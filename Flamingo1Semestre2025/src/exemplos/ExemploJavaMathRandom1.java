package exemplos;

import java.util.Scanner;

public class ExemploJavaMathRandom1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor maximo para o sorteio:");
		int valorMaximo = sc.nextInt();
		valorMaximo++;
		
		int numeroAleatorio = (int)(Math.random()*valorMaximo);
		System.out.println(numeroAleatorio);
		
		sc.close();
	}

}
