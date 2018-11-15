package Rezerwacje.git;

import java.time.LocalDateTime;
import java.util.List;

public interface Przychodnia {
	
	public List<Pracownik> listujPracownikow();
	public List<Pacjent> listujPacjentow();
	public List<Termin> listujTerminy();
	public List<Termin> listujTerminy(String specjalnosc);
	public List<Termin> listujTerminy(String specjalnosc, LocalDateTime data);
	public void zarezerwuj(Termin termin, Pacjent pacjent);
	public void usun(Termin termin);
	public void dodaj(Termin termin);
	public Termin dodajTermin(Pracownik pracownik, LocalDateTime data);
	
	
	
}


