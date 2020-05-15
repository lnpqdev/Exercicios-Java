package exerciciosGeneration;

public class exercicio2 {
	
	/* 2- Escreva um sistema estruturado que gere os números de 1000 a 1999 e escreva
	   somente os números que são divisíveis por 11 ou cujo resto é 5. 
	*/
	
	
	
	public static void main(String[] args) {
		
		
		for(int numero=1000;numero<=1999;numero++) {
			if(numero %11 ==0 || numero %11 ==5) {
				System.out.println(numero);
			}
		}
	}

}
