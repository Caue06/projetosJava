package exerciciosLista01;

import java.util.Scanner;

public class ConversaoTemperatura {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius:");
		float grauCelsius = sc.nextFloat();
		
		float grausFahrenheint = (grauCelsius * 9 / 5) + 32;
		
		System.out.println("A temperatura convertida em Fahrenheit é:" + grausFahrenheint);
		sc.close();
	}

}
