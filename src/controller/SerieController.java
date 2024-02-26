package controller;

public class SerieController {

	public SerieController() {
		
		super();
}	

	public double fnSerie(int num) {
		
		//Condição de parada ocorre quando o valor da variável num alcança 1, retornando o resultado do primeiro item da serie, "1".
		
		if(num == 1) {
			
			return 1;
			
		} else {
			
			return 1/(double)num + fnSerie(num - 1);
			//Retorno é dado dividindo 1 pelo valor atual de num, enquanto o retorno anterior da função é adicionado a esse resultado.
		}
		
	}

}
