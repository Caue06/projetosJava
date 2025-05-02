
package exerciciosLista07;

public class Exercicio03SomaPares1A500 {

	public static void main(String[] args) {
		int contadora = 0;
		int soma = 0;

		while (contadora < 501) {
			soma += contadora;
			contadora += 2;
		}
		System.out.println("A soma dos número pares de 1 a 500 é: " + soma);
	}

}
