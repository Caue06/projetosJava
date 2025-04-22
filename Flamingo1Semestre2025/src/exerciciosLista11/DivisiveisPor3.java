package exerciciosLista11;

public class DivisiveisPor3 {

	public static void main(String[] args) {
		int resultado = 0;

		for (int contadora = 1; contadora < 51; contadora++) {
			resultado = contadora % 3;

			if (resultado == 0) {
				System.out.println(contadora + " É divisivel por 3.");
			}
		}

	}
}
