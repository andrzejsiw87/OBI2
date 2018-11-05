package Komentarze.git;

public class Skrzydlo {
	
	//deklaracja klasy: nazwa klasy jest taka sama jak nazwa pliku
		public class Skrzydlo {
			
			//pola prywatne
			private int dlugosc;
			private int wysokosc;
			private Klamka klamka;
			private boolean otwarte = false;
			
			//konstruktor publiczny dwuargumentowy przyjmuj¹cy wartoœæ int
			public Skrzydlo(int dlugosc, int wysokosc) {
				this.dlugosc = dlugosc;
				this.wysokosc = wysokosc;
			}
			//konstruktor publiczny
			public Skrzydlo(int dlugosc, int wysokosc, Klamka klamka) {
				this(dlugosc,wysokosc);
				this.klamka = klamka; 
			}
			//metoda zwracaj¹ca wartoœæ pola d³ugoœæ
			public int getDlugosc() {
				return dlugosc;
			}
			//metoda dostêpowa ustawiaj¹ca wartoœæ pola d³ugoœæ
			public void setDlugosc(int dlugosc) {
				//d³ugoœæ=d³ugoœæ; nic nie robi bo nazwa d³ugoœæ zosta³a w wy¿szej linii zarezerwowana dla argumentu
				this.dlugosc = dlugosc;
			}
			//metoda zwracaj¹ca wartoœæ pola wysokoœæ
			public int getWysokosc() {
				return wysokosc;
			}
			//metoda dostêpowa ustawiaj¹ca wartoœæ pola wysokoœæ
			public void setWysokosc(int wysokosc) {
				this.wysokosc = wysokosc;
			}
			//metoda zwracaj¹ca wartoœæ pola klamka
			public Klamka getKlamka() {
				return klamka;
			}
			//metoda dostêpowa ustawiaj¹ca wartoœæ pola klamka
			public void setKlamka(Klamka klamka) {
				this.klamka = klamka;
			}
			//metoda zwracaj¹ca wartoœæ pola otwarte
			public boolean isOtwarte() {
				return otwarte;
			}
			//metoda dostêpowa ustawiaj¹ca wartoœæ pola otwarte
			public void setOtwarte(boolean otwarte) {
				this.otwarte = otwarte;
			}
			//metoda zwracaj¹ca wymiary, cy okno jest otwarte i zamkniête i czy jest klamka 
			public String stan() {
				String wymiary = dlugosc+"x"+wysokosc;
				String otwarcie = otwarte ? "otwarte" : "zamkniete";
				String stanKlamki = klamka!= null ? klamka.stan() : "bez klamki";
				return wymiary  +" "+ otwarcie +" "+ stanKlamki;
			}
		}

}
