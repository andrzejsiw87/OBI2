package Rezerwacje.git;

import java.time.LocalDateTime;

public class Termin {
	
	private LocalDateTime data;
	private Pracownik lekarz;
	private Pacjent pacjent;
	
	public Termin(LocalDateTime data, Pracownik lekarz, Pacjent pacjent){
		this.data = data;
		this.lekarz = lekarz;
		this.pacjent = pacjent;
	}
	
	public Termin(LocalDateTime data, Pracownik lekarz) {
		this.data = data;
		this.lekarz = lekarz;
	}
	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	public Pracownik getLekarz() {
		return lekarz;
	}
	public void setLekarz(Pracownik lekarz) {
		this.lekarz = lekarz;
	}
	public Pacjent getPacjent() {
		return pacjent;
	}
	public void setPacjent(Pacjent pacjent) {
		this.pacjent = pacjent;
	}
	

}
