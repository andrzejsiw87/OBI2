package Rezerwacje.git;

import java.time.LocalDateTime;
import java.util.List;

public class TestPrzychodni {

	public static void main(String[] args) {
		 
		Przychodnia przychodnia = new PrzychodniaImpl();
		List<Pracownik> pracownicy = przychodnia.listujPracownikow();
		System.out.println("Pracownicy:");
		for (Pracownik p : pracownicy) {
			System.out.println(p);	
		}
		
		List<Pacjent> pacjenci = przychodnia.listujPacjentow();
		System.out.println("Pacjenci:");
		for (Pacjent p : pacjenci) {
			System.out.println(p);	
		}
		
		Termin nowyTermin = new Termin(LocalDateTime.parse("2018-02-06T13:15:00"), pracownicy.get(0));
		przychodnia.dodaj(nowyTermin);
		przychodnia.dodajTermin(pracownicy.get(1), LocalDateTime.parse("2018-03-06T09:45:00"));
		
		List<Termin> wszystkieTerminy = przychodnia.listujTerminy();
		System.out.println("Terminy:");
		for (Termin t : wszystkieTerminy) {
			System.out.println(t);	
		}
		
		List<Termin> wolneTerminy = przychodnia.listujTerminy("Internista");
		
		System.out.println("Terminy u Internisty:");
		for (Termin t : wolneTerminy) {
			System.out.println(t);	
		}
		Termin termin = wolneTerminy.get(0);
		Pacjent pacjent = pacjenci.get(0);
		przychodnia.zarezerwuj(termin, pacjent);
		
		List<Termin> wolneTerminyChirurga = przychodnia.listujTerminy("Chirurg", LocalDateTime.parse("2018-01-01T10:00:00"));
		Termin drugiTermin = wolneTerminyChirurga.get(0);
		przychodnia.usun(drugiTermin);
		
	}

}
