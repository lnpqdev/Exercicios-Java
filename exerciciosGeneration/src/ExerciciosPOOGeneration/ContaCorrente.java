package ExerciciosPOOGeneration;

public class ContaCorrente {
	
	private int numeroDaAgencia;
	private int numeroDaConta;
	private double saldoAtual;
	private double operacaoSaque;
	private double operacaoDeposito;
	private double valor;
	
	public ContaCorrente(int numeroDaAgencia, int numeroDaConta, double saldoAtual, 
			double operacaoSaque, double operacaoDeposito, double valor) {
		
		this.numeroDaAgencia = numeroDaAgencia;
		this.numeroDaConta = numeroDaConta;
		this.saldoAtual = saldoAtual;
		this.operacaoSaque = operacaoSaque;
		this.operacaoDeposito = operacaoDeposito;
		this.valor = valor;
		
		
		
	}

	public int getNumeroDaAgencia() {
		return numeroDaAgencia;
	}

	public void setNumeroDaAgencia(int numeroDaAgencia) {
		this.numeroDaAgencia = numeroDaAgencia;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public double getSaldoAtual() {
		return saldoAtual;
	}

	public void setSaldoAtual(double saldoAtual) {
		this.saldoAtual = saldoAtual;
	}

	public double getOperacaoSaque() {
		return operacaoSaque;
	}

	public void setOperacaoSaque(double operacaoSaque) {
		this.operacaoSaque = operacaoSaque;
	}

	public double getOperacaoDeposito() {
		return operacaoDeposito;
	}

	public void setOperacaoDeposito(double operacaoDeposito) {
		this.operacaoDeposito = operacaoDeposito;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void mostraNumeroDaAgencia() {
		System.out.println("Número da Agencia: "+getNumeroDaAgencia());
	}
	
	public void mostraNumeroDaConta() {
		System.out.println("Número da Conta: "+getNumeroDaConta());
	}
	
	public void mostraSaldoAtual() {
		System.out.println("Seu Saldo em Conta é: R$"+getSaldoAtual());
	}
	

}
