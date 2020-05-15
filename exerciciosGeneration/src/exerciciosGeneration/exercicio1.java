package exerciciosGeneration;

public class exercicio1 {
	
	/*
	 1- Desenvolver um sistema que efetue a soma de todos os números ímpares
	 que são múltiplos de três e que se encontram no conjunto dos números de 1
	 até 500.
	 */
	
	public static void main(String[] args) {

		
		int soma = 0;
		
		for(int numero=1;numero<=500;numero++) {
			if(numero % 3 == 0 && numero% 2 != 0) {
				soma = soma + numero;
			}
		}
		System.out.println(soma);
	}

}