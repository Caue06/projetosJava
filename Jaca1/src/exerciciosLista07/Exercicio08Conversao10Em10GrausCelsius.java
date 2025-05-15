package exerciciosLista07;

public class Exercicio08Conversao10Em10GrausCelsius {

	public static void main(String[] args) {

		int contadora = 10;
		float fahrenheit = 0;

		while (contadora < 101) {
			fahrenheit = (contadora * 9 / 5) + 32;
			System.out.println( "Temperatura em Graus Celsius :" + contadora +" convertida em Graus Fahrenheit: " + fahrenheit);
			contadora += 10;
		}

	}

}
