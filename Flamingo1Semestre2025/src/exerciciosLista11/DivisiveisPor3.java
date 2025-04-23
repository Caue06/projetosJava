package exerciciosLista11;

public class DivisiveisPor3 {

	public static void main(String[] args) {
		int numerosDivisiveis = 0;

		for (int contadora = 1; contadora < 51; contadora++) {
			int resultado = contadora % 3;

			if (resultado == 0) {
				numerosDivisiveis++;
			}
		}
		System.out.println("Existem " + numerosDivisiveis + " numeros divisiveis por 3 entre 1 e 50.");
	}
}
