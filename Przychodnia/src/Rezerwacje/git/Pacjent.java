package Rezerwacje.git;

public class Pacjent {
	
	private String imie;
	
	public Pacjent (String imie) {
		this.imie = imie;
	}
	
	public String getImie() {
		return imie;
	}

	@Override
	public String toString() {
		return "Pacjent [imie: " + imie + "]";
	}
	
	


	

}
