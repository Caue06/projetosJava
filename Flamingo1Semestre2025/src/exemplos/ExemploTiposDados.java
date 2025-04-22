package exemplos;

public class ExemploTiposDados {

	public static void main(String[] args) {
		
		int itens = 50;
		float precoPorItem = 9.99f;
		float precoTotal = itens * precoPorItem;
		char moeda = '$';
		
		System.out.println("Numero de itens: " + itens);
		System.out.println("Preço por item: " + precoPorItem + moeda);
		System.out.println("Preço total: " + precoTotal + moeda);
	}

}
