package exemplos;

import java.util.Scanner;

public class Exemploifelse {
public static void main(String[]args) {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Digite sua idade:");
	int idade=sc.nextInt();
	
	if (idade<18){
		System.out.println("Não pode votar!");
	}
	else {
		System.out.println("Pode votar");
	}
	sc.close();
}
}
