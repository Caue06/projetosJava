package exerciciosLista07;

public class Exercicio07SequenciaDeFibonacci {

	public static void main(String[] args) {
		
		int primeiroNumero = 1;
		int segundoNumero = 1;
		int contadora = 0;
		
		System.out.print(primeiroNumero + " - " + segundoNumero);
		
		while(contadora < 13) {
			int soma= primeiroNumero + segundoNumero;
			System.out.print(" - " + soma);
			primeiroNumero = segundoNumero;
			segundoNumero = soma;
			contadora++;
		}
	}

}
