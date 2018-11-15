package Rezerwacje.git;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrzychodniaImpl implements Przychodnia {
	private static final int MAX_RESULTS = 5;
	private List<Pracownik> pracownicy = new ArrayList<>();
	private List<Pacjent> pacjenci = new ArrayList<>();
	private List<Termin> wszystkieTerminy = new ArrayList<>();
	
	public PrzychodniaImpl() {
		Pracownik lekarz1 = new Pracownik();
		lekarz1.setImie("Jan");
		lekarz1.setNazwisko("Nowak");
		Set<String> specjalnosci1 = new HashSet<>();
		specjalnosci1.add("Internista");
		specjalnosci1.add("Dermatolog");
		lekarz1.setSpecjalnosci(specjalnosci1);
				
		Pracownik lekarz2 = new Pracownik();
		lekarz2.setImie("Marek");
		lekarz2.setNazwisko("Kowalski");
		Set<String> specjalnosci2 = new HashSet<>();
		specjalnosci2.add("Chirurg");
		specjalnosci2.add("Dermatolog");
		lekarz2.setSpecjalnosci(specjalnosci2);
		
		pracownicy.add(lekarz1);
		pracownicy.add(lekarz2);
		
		Pacjent pacjent1 = new Pacjent("Krzysztof");
		Pacjent pacjent2 = new Pacjent("Rafa³");
		
		pacjenci.add(pacjent1);
		pacjenci.add(pacjent2);
		
		Termin termin11 = new Termin(LocalDateTime.parse("2018-01-01T12:30:00"), lekarz1);
		Termin termin12 = new Termin(LocalDateTime.parse("2018-01-01T13:00:00"), lekarz1);
		Termin termin13 = new Termin(LocalDateTime.parse("2018-01-01T13:30:00"), lekarz1);
		Termin termin14 = new Termin(LocalDateTime.parse("2018-01-01T14:00:00"), lekarz1);
		Termin termin15 = new Termin(LocalDateTime.parse("2018-01-01T14:30:00"), lekarz1);
		Termin termin16 = new Termin(LocalDateTime.parse("2018-01-01T15:00:00"), lekarz1);
		
		Termin termin21 = new Termin(LocalDateTime.parse("2018-01-01T12:30:00"), lekarz2);
		Termin termin22 = new Termin(LocalDateTime.parse("2018-01-01T13:00:00"), lekarz2);
		Termin termin23 = new Termin(LocalDateTime.parse("2018-01-01T13:30:00"), lekarz2);
		Termin termin24 = new Termin(LocalDateTime.parse("2018-01-01T14:00:00"), lekarz2);
		Termin termin25 = new Termin(LocalDateTime.parse("2018-01-01T14:30:00"), lekarz2);
		Termin termin26 = new Termin(LocalDateTime.parse("2018-01-01T15:00:00"), lekarz2);
		
		wszystkieTerminy.add(termin11);
		wszystkieTerminy.add(termin12);
		wszystkieTerminy.add(termin13);
		wszystkieTerminy.add(termin14);
		wszystkieTerminy.add(termin15);
		wszystkieTerminy.add(termin16);
		wszystkieTerminy.add(termin21);
		wszystkieTerminy.add(termin22);
		wszystkieTerminy.add(termin23);
		wszystkieTerminy.add(termin24);
		wszystkieTerminy.add(termin25);
		wszystkieTerminy.add(termin26);
		termin26.setPacjent(pacjent1);
		
	}

	@Override
	public List<Pracownik> listujPracownikow() {
		return pracownicy;
	}

	@Override
	public List<Pacjent> listujPacjentow() {
				return pacjenci;
	}

	@Override
	public List<Termin> listujTerminy() {
		sortujTerminy();
		return wszystkieTerminy;
	}

	@Override
	public List<Termin> listujTerminy(String specjalnosc) {
		sortujTerminy();
		List<Termin> wybraneTerminy = new ArrayList<>();
		int i = 0;
		for (Termin t: wszystkieTerminy) {
			if (t.getPacjent()==null && t.getLekarz().getSpecjalnosci().contains(specjalnosc)&& i< MAX_RESULTS) {
				wybraneTerminy.add(t);
				i++;
			}
		}
		return wybraneTerminy;
	}

	@Override
	public List<Termin> listujTerminy(String specjalnosc, LocalDateTime data) {


		
		sortujTerminy();
		List<Termin> wybraneTerminy = new ArrayList<>();
		int i = 0;
		for (Termin t: wszystkieTerminy) {
			if (t.getPacjent()==null && t.getLekarz().getSpecjalnosci().contains(specjalnosc) && t.getData().isAfter(data)&& i< MAX_RESULTS) {
				wybraneTerminy.add(t);
				i++;
			}
		}
		return wybraneTerminy;
	}

	@Override
	public void zarezerwuj(Termin termin, Pacjent pacjent) {
		termin.setPacjent(pacjent);
	}

	@Override
	public void usun(Termin termin) {
		wszystkieTerminy.remove(termin);		
	}

	private void sortujTerminy() {
		wszystkieTerminy.sort(new Comparator<Termin>() {

			@Override
			public int compare(Termin t1, Termin t2) {
				LocalDateTime date1 = t1.getData();
				LocalDateTime date2 = t2.getData();
				return date1.compareTo(date2);
			}
			
		});
	}

	@Override
	public void dodaj(Termin termin) {
		wszystkieTerminy.add(termin);
		
	}

	@Override
	public Termin dodajTermin(Pracownik pracownik, LocalDateTime data) {
		Termin termin = new Termin(data, pracownik);
		wszystkieTerminy.add(termin);
		return termin;
	}
}
