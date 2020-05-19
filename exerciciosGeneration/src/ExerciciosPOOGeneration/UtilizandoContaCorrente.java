package ExerciciosPOOGeneration;

import java.util.Scanner;

public class UtilizandoContaCorrente {
	
	public static void main(String[] args) {
		
		int numeroDaAgencia = 0;
		int numeroDaConta = 0;
		double saldoAtual = 5000.00;
		double operacaoSaque = 0;
		double operacaoDeposito = 0;
		double valor = 0;
		
		ContaCorrente NovaContaCorrente = new ContaCorrente(numeroDaAgencia, numeroDaConta, saldoAtual, 
				operacaoSaque, operacaoDeposito, valor );
		
		System.out.print("Informe o numero da Agência: ");
		Scanner entrada = new Scanner(System.in);		
		numeroDaAgencia = entrada.nextInt();
		NovaContaCorrente.setNumeroDaAgencia(numeroDaAgencia);
		
		System.out.print("Informe o numero da Conta: ");	
		numeroDaConta = entrada.nextInt();
		NovaContaCorrente.setNumeroDaConta(numeroDaConta);
		
		NovaContaCorrente.mostraNumeroDaAgencia();
		NovaContaCorrente.mostraNumeroDaConta();
		
		
		valor = 0;
		
		do {
			System.out.println("Seja Bem Vindo ! O que deseja fazer ?");
			System.out.println(" 1) Deposito");
			System.out.println(" 2) Saque");
			System.out.println(" 3) Saldo");
			System.out.println(" 4) Consultar Agência e Conta");
			System.out.println(" 0) Sair");
			
			System.out.println(" Digite o código da Operação desejada: ");
			valor = entrada.nextInt();
			
			if( valor != 0) {
				
				//System.out.println("Realize a Operação...");
				
			if ( valor == 1) {
				
				System.out.println("Informe o valor a Ser Depositado: ");
				operacaoDeposito = entrada.nextInt();
				saldoAtual = saldoAtual + operacaoDeposito;
				System.out.println("--------------------------------");
				NovaContaCorrente.setSaldoAtual(saldoAtual);
				NovaContaCorrente.mostraSaldoAtual();
				System.out.println("--------------------------------");
				
			} else {
				if ( valor == 2) {
					System.out.println("Informe o valor a ser sacado: ");
					operacaoSaque= entrada.nextInt();
					saldoAtual = saldoAtual - operacaoSaque;
					System.out.println("--------------------------------");
					NovaContaCorrente.setSaldoAtual(saldoAtual);
					NovaContaCorrente.mostraSaldoAtual();
					System.out.println("--------------------------------");
				}
				if ( valor == 3) {
					System.out.println("--------------------------------");
					NovaContaCorrente.mostraSaldoAtual();
					System.out.println("--------------------------------");
				}
				
			}if ( valor == 4) {
				
				System.out.println("---------------------");
				NovaContaCorrente.mostraNumeroDaAgencia();
				NovaContaCorrente.mostraNumeroDaConta();
				System.out.println("---------------------");
			}
				
			}
		}while ( valor != 0);
			
		
		System.out.println("Volte Sempre para o Seu Banco feito para Você!");

		
		
		
		
		
		
		
	}

}
