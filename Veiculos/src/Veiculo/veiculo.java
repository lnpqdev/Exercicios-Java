package Veiculo;

import java.util.Scanner;

public class veiculo {
	
	private String nome;
	private String cor;
	private int acelerar;
	private int frear;
	private int capotar;
	

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
	
	public int getAcelerar() {
		return acelerar;
	}
	public void setAcelerar(int acelerar) {
		this.acelerar = acelerar;
	}
	public int getFrear() {
		return frear;
	}
	public void setFrear(int frear) {
		this.frear = frear;
	}
	public int getCapotar() {
		return capotar;
	}
	public void setCapotar(int capotar) {
		this.capotar = capotar;
	}
	
	
	public void NomeVeiculo() {
		System.out.println("Veiculo: "+ this.nome);
	}
	
	public void corVeiculo() {
		System.out.println("A cor do veiculo é: "+ this.cor);
	}
	
	
	public void acelerando() {
		int velocidade = 0;
		for(velocidade = 0; velocidade <=70; velocidade++) {
			System.out.println("A velocidade atual é: " + velocidade);
		}if(velocidade ==70) {
			System.out.println("Curva Perigosa o Carro capotou!");
	}
	
		
	}
			

}
