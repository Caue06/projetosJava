package exerciciosLista07;

public class Exercicio10SomaEMediaDosParesEntre50E70 {

	public static void main(String[] args) {
		int contadora = 50;
		int soma = 0;
		int contadora1 = 0;

		while (contadora < 71) {
			soma += contadora;
			contadora += 2;
			contadora1++;
		}
		int media = soma / contadora1;
		System.out.println("Soma Total: " + soma);
		System.out.println("Media: " + media);
	}

}
