package exerciciosLista3;

import java.util.Scanner;

public class Exercicio09SalarioReajuste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do salario atual:");
		float salario = sc.nextFloat();

		System.out.println("Digite o percentual de reajuste:");
		float percentualReajuste = sc.nextFloat();

		float resultadoPorcentagem = (percentualReajuste / salario) * 100;
		
		salario = salario + resultadoPorcentagem;
		
		System.out.println("O valor do novo salario é: " + salario);
		sc.close();

	}

}
