package Aeronave;

public class aeronave {
	
	private String nomeAeronave;
	private String CorAeronave;
	private String fabricante;
	private Boolean TremDePouso;
	private Boolean helices;
	
	
	public String getNomeAeronave() {
		return nomeAeronave;
	}
	public void setNomeAeronave(String nomeAeronave) {
		this.nomeAeronave = nomeAeronave;
	}
	public String getCorAeronave() {
		return CorAeronave;
	}
	public void setCorAeronave(String corAeronave) {
		CorAeronave = corAeronave;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public Boolean getTremDePouso() {
		return TremDePouso;
	}
	public void setTremDePouso(Boolean tremDePouso) {
		TremDePouso = tremDePouso;
	}
	public Boolean getHelices() {
		return helices;
	}
	public void setHelices(Boolean helices) {
		this.helices = helices;
	}
	
	public void AeronavePronta() {
		System.out.println("A aeronave " + this.nomeAeronave + " Está pronta para iniciar.");
	}
	public void TremPousoOk( ) {
		System.out.println("Trem de pouso pronto: " +this.TremDePouso + "\nHelices Funcionando: " +this.helices);
	}
	public void AeronaveDecolar() {
		if (this.TremDePouso && this.helices == true){
			System.out.println("A aeronave " +this.nomeAeronave + " Está decolando");
		}else
			System.out.println("A aeronave " +this.nomeAeronave + " Não pode Decolar");
		}
		
	
	
	

	


}
