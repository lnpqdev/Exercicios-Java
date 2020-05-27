package Main;

import Aeronave.aeronave;

public class main {
	
	public static void main(String[] args) {
		
		aeronave nave = new aeronave();
		
		nave.setNomeAeronave("AMX A-1");
		nave.setCorAeronave("Verde-oliva");
		nave.setFabricante("AMX Internacional");
		nave.setHelices(true);
		nave.setTremDePouso(true);
		
		nave.AeronavePronta();
		nave.TremPousoOk();
		nave.AeronaveDecolar();
		
		
		
	}

}
