package ExerciciosPOOGeneration;

import java.util.Scanner;

public class UtilizandoPessoa2 {
	
	public static void main(String[] args) {
		
		String nome = "";
		int anoDeNascimento= 0;
		int calcularIdade = 0;
		int Idade50Anos = 0;
		
		Pessoa2 novapessoa = new Pessoa2(nome, anoDeNascimento, calcularIdade, Idade50Anos);
				
		System.out.print("Informe o nome: ");
		Scanner entrada = new Scanner(System.in);		
		nome = entrada.nextLine();
		novapessoa.setNome(nome);
		
		System.out.print("Informe o ano de nascimento: ");
		anoDeNascimento = entrada.nextInt();
		novapessoa.setAnoDeNascimento(anoDeNascimento);
		
		novapessoa.mostraCalcularIdade();
		novapessoa.mostraIdade50Anos();
		
		
	}

}
