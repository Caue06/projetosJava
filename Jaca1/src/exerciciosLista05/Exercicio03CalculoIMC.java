package exerciciosLista05;

import java.util.Scanner;

public class Exercicio03CalculoIMC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("                   Calculo de IMC");
		
		System.out.println("Digite o seu peso em quilos:");
		float peso = sc.nextFloat();
		
		System.out.println("Digite a sua altura em metros:");
		float altura = sc.nextFloat();
		
		float imc = peso / (altura * altura);
		System.out.println(imc);
		
		if(imc < 18.5) {
			System.out.println("Baixo peso.");
		}else if(imc > 18.5 && imc < 24.9) {
			System.out.println("Peso adequado.");
		}else if(imc > 25 && imc < 29.9) {
			System.out.println("sobrepeso");
		}else if(imc > 30 && imc < 34.9) {
			System.out.println("Obesdade grau 1");
		}else if(imc > 35 && imc < 39.9) {
			System.out.println("Obesidade grau 2");
		}else {
			System.out.println("Obesidade extrema");
		}
	}

}
