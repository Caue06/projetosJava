package exerciciosLista07;

public class Exercicio05Potencia3Expoente0A15 {

	public static void main(String[] args) {
		int contadora = 0;

		while (contadora < 16) {
			double potencia = Math.pow(3, contadora);
			int inteiro = (int) potencia;
			System.out.println(inteiro);
			contadora++;
		}
	}

}
