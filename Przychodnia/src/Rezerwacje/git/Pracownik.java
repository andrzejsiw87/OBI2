package Rezerwacje.git;

import java.util.Set;

public class Pracownik {
	
	private String imie;
	private Set<String> specjalnosci;

	
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public Set<String> getSpecjalnosci() {
		return specjalnosci;
	}
	public void setSpecjalnosci(Set<String> specjalnosci) {
		this.specjalnosci = specjalnosci;
	}
	
	@Override
	public String toString() {
		return "Pracownik: {imie: " + imie + ", specjalnosci: " + specjalnosci + "}";
	}

}
