package Rezerwacje.git;

import java.util.Set;

public class Pracownik {
	
	private String imie;
	private String nazwisko;
	private Set<String> specjalnosci;

	
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public Set<String> getSpecjalnosci() {
		return specjalnosci;
	}
	public void setSpecjalnosci(Set<String> specjalnosci) {
		this.specjalnosci = specjalnosci;
	}
	
	@Override
	public String toString() {
		return "Pracownik: {imie: " + imie + ", nazwisko: " + nazwisko + " specjalnosci: " + specjalnosci + "}";
	}

}
