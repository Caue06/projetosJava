package exemplos;

import java.util.Scanner;

public class ExemploElseIf {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Digite sua idade:");
	int idade=sc.nextInt();
	
	if (idade<16){
		System.out.println("Você não pode votar");
	}
	else if (idade<18) {
		System.out.println("Você pode votar");
	}
	else {
		System.out.println("Você é obrigado a votar");
	}
	sc.close();
}
}
