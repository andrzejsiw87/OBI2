package Komentarze.git;

//deklaracja klasy: nazwa klasy jest taka sama jak nazwa pliku
public class Klamka {
	
	//pole prywatne
	private boolean czyKluczyk = false;
	
	//metoda publiczna
	public boolean isCzyKluczyk() {
		return czyKluczyk;
	}
	//metoda dostêpowa ustawiaj¹ca wartosc pola CzyKluczyk
	public void setCzyKluczyk(boolean czyKluczyk) {
		this.czyKluczyk = czyKluczyk;
	}
	//metoda publiczna sprawdzajaca stan pola czyKluczyk
	public String stan() {
		return czyKluczyk ? "z kluczem": "bez klucza";
	}

}
