package Eletro;

public class Eletrodomestico {
	
	private String nome;
	private String cor;
	private Boolean biVolt;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Boolean getBiVolt() {
		return biVolt;
	}
	public void setBiVolt(Boolean biVolt) {
		this.biVolt = biVolt;
	}

	public void produto() {
		System.out.println("O produto " +this.nome + " Possui a cor " +this.cor +".");
	}
	
	public void voltagem() {
		if( this.biVolt == true) 
			System.out.println("Pode colocar em qualquer tomada.");
		else
			System.out.println("Não é Bi-Volt verifique a voltagem do produto antes de colocar na tomada.");
		
	}
	
	

}
