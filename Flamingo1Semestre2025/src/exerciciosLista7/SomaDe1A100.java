package exerciciosLista7;

public class SomaDe1A100 {

	public static void main(String[] args) {
		int contadora = 0;
		int soma = 0;
		
		while(contadora < 100) {
			contadora++;
			soma += contadora;
			}
		System.out.println("A soma dos primeiros cem numeros é: " + soma);
	}

}
