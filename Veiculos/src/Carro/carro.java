package Carro;

import Veiculo.veiculo;

public class carro extends veiculo{
	
	private String tipoDoCarro;
	private String MarcaDoCarro;
	
	public String getTipoDoCarro() {
		return tipoDoCarro;
	}
	public void setTipoDoCarro(String tipoDoCarro) {
		this.tipoDoCarro = tipoDoCarro;
	}
	public String getMarcaDoCarro() {
		return MarcaDoCarro;
	}
	public void setMarcaDoCarro(String marcaDoCarro) {
		MarcaDoCarro = marcaDoCarro;
	}
	
	public void tipoeMarca() {
		System.out.println("O carro é " +this.tipoDoCarro + " e da marca " + this.MarcaDoCarro + ".");
	}
	
	
	
	

}
