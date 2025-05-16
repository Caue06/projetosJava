package exemplos;

public class SuperHeroiParametros {
	int idade;
	float altura, peso;

	public SuperHeroiParametros(int idadeSuperHeroi, float alturaSuperHeroi, float pesoSuperHeroi) {
		idade = idadeSuperHeroi;
		altura = alturaSuperHeroi;
		peso = pesoSuperHeroi;

	}

	public static void main(String[] args) {
		SuperHeroiParametros dialogo = new SuperHeroiParametros(18, 1.10f, 200f);
		System.out.println(dialogo.idade);
		System.out.println(dialogo.altura);
		System.out.println(dialogo.peso);

	}

}
