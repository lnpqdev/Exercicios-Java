package ExerciciosPOOGeneration;

public class UtilizandoPessoa {
	
	public static void main(String[] args) {
		
		String nome = "Maria dos Santos";
		String email= "maria@gmail.com";
		int telefone = 2255_9999;
		
		Pessoa minhapessoa = new Pessoa(nome, email, telefone);
		
		minhapessoa.mostraNome();
		
		minhapessoa.mostraEmail();
		
		minhapessoa.mostraTelefone();
		
		
		
		
		
	}

}
