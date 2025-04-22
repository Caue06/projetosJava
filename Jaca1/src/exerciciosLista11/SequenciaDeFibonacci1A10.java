package exerciciosLista11;

public class SequenciaDeFibonacci1A10 {

	public static void main(String[] args) {
		
		int primeiroNumero = 1;
		int segundoNumero = 1;
		
		
		System.out.print(primeiroNumero + " - " + segundoNumero);
		
		for(int contadora = 0; contadora < 8 ; contadora++) {
			int soma = primeiroNumero + segundoNumero;
			
			System.out.print(" - " + soma);
			
			primeiroNumero = segundoNumero;
			segundoNumero = soma;
		}
	}

}
