package ExerciciosPOOGeneration;


public class Pessoa2 {
	
	private String nome;
	private int anoDeNascimento;
	public int calcularIdade;
	public int Idade50Anos;
	public int idade;
	
	public Pessoa2(String nome, int anoDeNascimento, int calcularIdade, int Idade50Anos) {
		
		this.nome = nome;
		this.anoDeNascimento = anoDeNascimento;
		this.calcularIdade= calcularIdade;
		this.Idade50Anos= Idade50Anos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoDeNascimento() {
		return anoDeNascimento;
	}

	public void setAnoDeNascimento(int anoDeNascimento) {
		this.anoDeNascimento = anoDeNascimento;
	}
	
	public int getCalcularIdade() {
		return calcularIdade;
	}

	public void setCalcularIdade(int calcularIdade) {
		this.calcularIdade = calcularIdade;
	}
	
	public int getIdade50Anos() {
		return Idade50Anos;
	}

	public void setIdade50Anos(int idade50Anos) {
		Idade50Anos = idade50Anos;
	}
	
	public void mostraNome()
	{
		System.out.println("Nome: "+getNome());
	}
	
	public void mostraanoDeNascimento()
	{
		System.out.println("Nascimento: "+getAnoDeNascimento());		
	}
	
	public void mostraCalcularIdade()
	{
		idade = +getAnoDeNascimento();
		idade = 2020 - idade;
		System.out.println("Sua idade é: "+idade);
	}
	
	public void mostraIdade50Anos()
	{
		
		int idade50Anos = idade;
		idade50Anos = idade +50;
		System.out.println("Sua idade daqui a 50 anos é: "+idade50Anos);
	}



}
