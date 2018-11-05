package Komentarze.git;

public class Skrzydlo {
	
	//deklaracja klasy: nazwa klasy jest taka sama jak nazwa pliku
		public class Skrzydlo {
			
			//pola prywatne
			private int dlugosc;
			private int wysokosc;
			private Klamka klamka;
			private boolean otwarte = false;
			
			//konstruktor publiczny dwuargumentowy przyjmuj�cy warto�� int
			public Skrzydlo(int dlugosc, int wysokosc) {
				this.dlugosc = dlugosc;
				this.wysokosc = wysokosc;
			}
			//konstruktor publiczny
			public Skrzydlo(int dlugosc, int wysokosc, Klamka klamka) {
				this(dlugosc,wysokosc);
				this.klamka = klamka; 
			}
			//metoda zwracaj�ca warto�� pola d�ugo��
			public int getDlugosc() {
				return dlugosc;
			}
			//metoda dost�powa ustawiaj�ca warto�� pola d�ugo��
			public void setDlugosc(int dlugosc) {
				//d�ugo��=d�ugo��; nic nie robi bo nazwa d�ugo�� zosta�a w wy�szej linii zarezerwowana dla argumentu
				this.dlugosc = dlugosc;
			}
			//metoda zwracaj�ca warto�� pola wysoko��
			public int getWysokosc() {
				return wysokosc;
			}
			//metoda dost�powa ustawiaj�ca warto�� pola wysoko��
			public void setWysokosc(int wysokosc) {
				this.wysokosc = wysokosc;
			}
			//metoda zwracaj�ca warto�� pola klamka
			public Klamka getKlamka() {
				return klamka;
			}
			//metoda dost�powa ustawiaj�ca warto�� pola klamka
			public void setKlamka(Klamka klamka) {
				this.klamka = klamka;
			}
			//metoda zwracaj�ca warto�� pola otwarte
			public boolean isOtwarte() {
				return otwarte;
			}
			//metoda dost�powa ustawiaj�ca warto�� pola otwarte
			public void setOtwarte(boolean otwarte) {
				this.otwarte = otwarte;
			}
			//metoda zwracaj�ca wymiary, cy okno jest otwarte i zamkni�te i czy jest klamka 
			public String stan() {
				String wymiary = dlugosc+"x"+wysokosc;
				String otwarcie = otwarte ? "otwarte" : "zamkniete";
				String stanKlamki = klamka!= null ? klamka.stan() : "bez klamki";
				return wymiary  +" "+ otwarcie +" "+ stanKlamki;
			}
		}

}
