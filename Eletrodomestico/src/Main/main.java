package Main;

import Eletro.Eletrodomestico;

public class main {
	
	public static void main(String[] args) {
		
		Eletrodomestico eletro = new Eletrodomestico();
		
		eletro.setNome("Microondas");
		eletro.setCor("branco");
		eletro.setBiVolt(false);
		
		eletro.produto();
		eletro.voltagem();
		
		
		
	}

}
