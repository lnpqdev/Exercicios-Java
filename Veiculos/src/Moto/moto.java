package Moto;

import Veiculo.veiculo;

public class moto extends veiculo{
	
	private String tipoDaMoto;
	private String MarcaDaMoto;
	
	public String getTipoDaMoto() {
		return tipoDaMoto;
	}

	public void setTipoDaMoto(String tipoDaMoto) {
		this.tipoDaMoto = tipoDaMoto;
	}

	public String getMarcaDaMoto() {
		return MarcaDaMoto;
	}

	public void setMarcaDaMoto(String marcaDaMoto) {
		MarcaDaMoto = marcaDaMoto;
	}

	public void tipoeMarcaMoto() {
		System.out.println("A moto é " +this.tipoDaMoto + " e da marca " + this.MarcaDaMoto + ".");
	}
	

}
