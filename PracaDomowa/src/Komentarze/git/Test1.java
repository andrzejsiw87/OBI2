package Komentarze.git
	
	//deklaracja klasy: nazwa klasy jest taka sama jak nazwa pliku
	public class Test1 {
		
		//metoda statyczna main wywokywana w trakcie uruchomienia tego pliku
		public static void main(String[] args) {
			
			//utworzenie zmiennych okno1 i okno2 i ich zainicjowanie
			Okno okno1 = new Okno();
			Okno okno2 = new Okno(1800,1800,3);
			
			//wywo³anie metody "otwórz"
			okno1.otworz();
			okno2.otworz(0);
			okno2.otworz(2);
			
			//wywo³anie metody "wypisz stan"
			okno1.wypiszStan();
			okno2.wypiszStan();
			
			//wywo³anie metod "zamknij" oraz metody ustawiaj¹cej d³ugosc okna
			okno1.zamknij();
			okno2.setDlugosc(2100);
			okno2.zamknij(0);
			
			//utworzenie i zainicjowanie zmiennej
			Klamka kl = new Klamka();
			kl.setCzyKluczyk(true);
			
			//metody dostepowe i zwracajace 
			okno2.getSkrzydla()[1].setKlamka(kl);
			okno2.getSkrzydla()[2].setKlamka(null);
			
			//wywo³anie metody "wypisz stan"
			okno1.wypiszStan();
			okno2.wypiszStan();
			
		}
	}


