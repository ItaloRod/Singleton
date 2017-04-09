
public class Main {

	public static void main(String[] args) {
		FabricaDeCarro fabrica = FabricaDeCarro.getinstancia();
		
		System.out.println(fabrica.criarCarroFiat());
		System.out.println(fabrica.criarCarroFord());
		System.out.println(fabrica.criarCarroVolks());
		System.out.println(fabrica.GerarRelatorio());
		

	}

}
