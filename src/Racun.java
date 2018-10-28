


import java.util.Scanner;
public class Racun extends Izbornik {
	private int brojRacuna;
	private String imeMusterije;
	public int brojPosudjenihKnjiga;
	private static int brojSvihRacuna;

	public Racun() {
		brojSvihRacuna++;
	}
	public void vracanjeKnjige() {
		brojPosudjenihKnjiga--;
	}	
	public Racun(int brojPosudjenihKnjiga) {
			this.brojPosudjenihKnjiga = brojPosudjenihKnjiga;
		}
		public int getBrojRacuna() {
			return brojRacuna;
		}
		public void setBrojRacuna(int brojRacuna) {
			this.brojRacuna = brojRacuna;
		}
		public String getImeMusterije() {
			return imeMusterije;
		}
		public void setImeMusterije(String imeMusterije) {
			this.imeMusterije = imeMusterije;
		}
		public int getbrojPosudjenihKnjiga() {
			return brojPosudjenihKnjiga;
		}
		public void dodajKnjigu(int broj) {
			brojPosudjenihKnjiga=brojPosudjenihKnjiga+broj;
		}
		@Override
		public String toString() {
			return "\n Broj racuna: " + brojRacuna + "\n Ime: " + imeMusterije + "\n Broj posudjenih knjiga : "
					+ brojPosudjenihKnjiga;
		}
}