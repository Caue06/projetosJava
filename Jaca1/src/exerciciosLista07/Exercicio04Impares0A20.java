package exerciciosLista07;

public class Exercicio04Impares0A20 {

	public static void main(String[] args) {
		int contadora = 0;
		
		while(contadora < 21) {
			if(contadora % 2 != 0) {
				System.out.println(contadora);
			}
			contadora++;
		}
	}

}
