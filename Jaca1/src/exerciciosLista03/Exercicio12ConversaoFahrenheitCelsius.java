package exerciciosLista03;

import java.util.Scanner;

public class Exercicio12ConversaoFahrenheitCelsius {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os a temperatura em graus Fahrenheit");
		float fahrenheit = sc.nextFloat();
		//C/5 = (F-32)/9.
		
		float celsius = 5 * (fahrenheit - 32) / 9;
		System.out.println("A temperatura convertida em graus Celsius é: " + celsius + "C°");
		sc.close();
	}

}
