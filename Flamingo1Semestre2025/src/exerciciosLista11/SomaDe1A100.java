package exerciciosLista11;

public class SomaDe1A100 {

	public static void main(String[] args) {
		int soma = 0;
		
		for(int numero = 1; numero < 101; numero++) {
			soma = soma + numero;
		}
		System.out.println(soma);
	}

}
