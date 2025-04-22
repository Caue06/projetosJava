package exemplos;

public class Cronometro {

	public static void main(String[] args) {
		for (int hora = 1; hora < 24; hora++) {
			for (int minuto = 1; minuto < 60; minuto++) {
				for (int segundo = 1; segundo < 60; segundo++) {
					System.out.println(hora + " : " + minuto + " : " + segundo);
				}
			}
		}
	}

}
