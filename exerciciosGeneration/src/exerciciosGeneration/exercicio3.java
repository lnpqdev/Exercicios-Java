package exerciciosGeneration;

public class exercicio3 {
	
	
	public static void main(String[] args) {
		
		
		for(int numero=233; numero<=456; numero++) {
			if(numero>=300 && numero<=400){
				System.out.println(numero=numero+2);
			}else if (numero>=233 && numero<=400){
				System.out.println(numero=numero+4);
			}else if (numero>=400 && numero<=456){
				System.out.println(numero=numero+4);
			}
			
			}
		
		/* Outra forma de fazer...
		 * for(int numero=233; numero<=456; numero++) {
		 
			if(numero>=300 && numero<=400){
				System.out.println(numero=numero+2);
			}else {
				System.out.println(numero=numero+4);
			}
			
			}
	*/
		
}
}

