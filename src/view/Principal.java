package view;
import controller.SerieController;
public class Principal {

	public static void main(String[] args) {
		
		SerieController src = new SerieController();
				
		int num = 5;
		
		double resultado = src.fnSerie(num);
		
		System.out.println(resultado);
		
	}
	
}
