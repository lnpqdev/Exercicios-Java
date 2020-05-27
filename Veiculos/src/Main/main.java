package Main;

import Carro.carro;
import Moto.moto;

public class main {
	
	public static void main(String[] args) {
		
		carro carros = new carro();
		
		carros.setNome("Honda Fit");
		carros.setCor("Branca");
		carros.setMarcaDoCarro("Honda");
		carros.setTipoDoCarro("Sedan");
		
		carros.NomeVeiculo();
		carros.corVeiculo();
		carros.tipoeMarca();
		carros.acelerando();
		
		
		System.out.println("\n -------------------------------\n");
		
		moto motos = new moto();
		
		motos.setNome("CB1000R");
		motos.setCor("Branca");
		motos.setMarcaDaMoto("Honda");
		motos.setTipoDaMoto("Esportiva");
		
		motos.NomeVeiculo();
		motos.corVeiculo();
		motos.tipoeMarcaMoto();
		
		
		
		
		
		
		
		
		
		
	}

}
