package exerciciosLista3;

import java.util.Scanner;

public class Exercicio11SalarioVendedor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("             Calcular o salario de um Vendedor");

		System.out.println("Digite o salario fixo do vendedor:");
		float salarioFixo = sc.nextFloat();

		System.out.println("Digite o numero de carros vendidos por ele:");
		float numeroCarrosVendidos = sc.nextFloat();

		System.out.println("Digite o valor que ele recebe por cada carro vendido:");
		float valorPorCarroVendido = sc.nextFloat();

		System.out.println("Digite o valor total de suas vendas vendas:");
		float valorTotalVendas = sc.nextFloat();
		
		float comissao = numeroCarrosVendidos * valorPorCarroVendido;
		
		float salarioFinal = salarioFixo + comissao + ((5 / valorTotalVendas) * 100);
		
		System.out.println("O salario final do vendedor é: R$" + salarioFinal);
		sc.close();
	}

}
