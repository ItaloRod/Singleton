
public class FabricaDeCarro {
	
	protected static FabricaDeCarro instancia;
	protected int totalCarrosFiat;
	protected int totalCarrosFord;
	protected int totalCarrosVolks;
	
	protected FabricaDeCarro () {
		
	}
	/* Singleton é um padrão que permite que se crie somente
	 * uma instancia de um objeto. Ao se criar o objeto, em 
	 * vez de usar o seu construtor, ele se utiliza de um 
	 * método que o instancia ou que retorna esse valor.
	*/
	public static FabricaDeCarro getinstancia(){
		
		if(instancia == null){
			instancia = new FabricaDeCarro();	
		}
		return instancia;
	}
	public String criarCarroVolks(){
		this.totalCarrosVolks++;
		return new String("Carro Volks #" + totalCarrosVolks + " Criado");
	}
	public String criarCarroFord(){
		this.totalCarrosFord++;
		return new String("Carro Ford #" + totalCarrosFord + " Criado");
	}
	public String criarCarroFiat(){
		this.totalCarrosFiat++;
		return new String("Carro Fiat #" + totalCarrosFiat + " Criado");
	}
	
	public String GerarRelatorio(){
		return new String("Total de carros Fiat vendidos: "+ totalCarrosFiat + "\nTotal de carros Ford vendidos: " + totalCarrosFord + "\nTotal de carros Volks vendidos: " + totalCarrosVolks);
	}

}
