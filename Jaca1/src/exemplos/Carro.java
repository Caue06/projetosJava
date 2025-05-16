package exemplos;

public class Carro {

	String marca, modelo, placa, cor;
	int ano, km;

	public Carro(String marcaCarroFulano, String modeloCarroFulano, String placaCarroFulano, String corCarroFulano,
			int anoCarroFulano, int kmCarroFulano) {
		marca = marcaCarroFulano;
		modelo = modeloCarroFulano;
		placa = placaCarroFulano;
		cor = corCarroFulano;
		ano = anoCarroFulano;
		km = kmCarroFulano;
	}
	
	public static void main(String[] args) {
		Carro CarroCiclano = new Carro("BMW","X1","CAM999","Preto",2000,99999);
		System.out.println(CarroCiclano.marca);
		System.out.println(CarroCiclano.modelo);
		System.out.println(CarroCiclano.placa);
		System.out.println(CarroCiclano.cor);
		System.out.println(CarroCiclano.ano);
		System.out.println(CarroCiclano.km);
}

}
