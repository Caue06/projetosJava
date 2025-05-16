package exemplos;

public class SuperHeroi {
	int idade;
	float altura, peso;
	
	public SuperHeroi(){
		idade = 5;
		altura = 80;
		peso = 200;

	}
	
	public static void main(String[] args) {
		SuperHeroi dialogo = new SuperHeroi();
		System.out.println(dialogo.idade);
		System.out.println(dialogo.altura);
		System.out.println(dialogo.peso);
		
	}
	
}
