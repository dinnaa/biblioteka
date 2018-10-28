
import java.util.ArrayList;
import java.util.Scanner;

public class Izbornik {
	public static ArrayList<Racun> racuni = new ArrayList<Racun>();
	static Scanner input = new Scanner(System.in);
	public static void option() {
		System.out.println("Izaberite opciju koju zelite(1,2 ili 3): ");
		System.out.println("1-Kreiranje racuna u biblioteci, 2-dodati knjigu, 3-Podici knjigu");
		int biranjeOpcije = input.nextInt();
		while (biranjeOpcije != 1 && biranjeOpcije != 2 && biranjeOpcije != 3) {
			System.out.println("Izaberite tacnu opciju");
			biranjeOpcije = input.nextInt();
		}
		switch (biranjeOpcije) {
		case 1:
			kreiranjeRacuna();break;
		case 2:
			kreiranjeKnjige();break;
		case 3:
			podizanjeKnjige();break;
		}
	}
	public static void kreiranjeRacuna() {
		Racun racun = new Racun();
		System.out.println("Unesite broj racuna: ");
		int brojRacuna = input.nextInt();
		while (brojRacuna<=0) {
			System.out.println("Morate unijeti pozitivan broj. Ponovite unos. ");
			brojRacuna = input.nextInt();
		}
		while (iskoristenBroj(brojRacuna)) {
			System.out.println("Upisani broj je zauzet.Unesite novi broj racuna.");
			brojRacuna = input.nextInt();
		}
		racun.setBrojRacuna(brojRacuna);
		System.out.println("Unesite vase ime:");
		String ime = input.next();
		racun.setImeMusterije(ime);
		System.out.println("Racun je uspjesno kreiran.");
		System.out.println("Broj vaseg racuna je: " + racun.getBrojRacuna());
		option();
	}
	public static boolean iskoristenBroj(int broj) {
		for(int i=0;i<racuni.size();i++) {
			if(racuni.get(i).getBrojRacuna()==broj)
				return true;
		}
		return false;
	}
	public static void kreiranjeKnjige() {
		System.out.println("Unesite broj knjige: ");
		int brojKnjige = input.nextInt();
		System.out.println("Unesite naziv knjige: ");
		String naziv = input.next();
	//	Knjiga knjiga = new Knjiga(brojKnjige, naziv);
	}	
	public static void podizanjeKnjige(){
		System.out.println("Unesite broj racuna: ");
		int brojRacuna = input.nextInt();
		System.out.println("Unesite broj zeljene knjige: ");
		int brojKnjige = input.nextInt();
	//	PodizanjeKnjige podizanje = new PodizanjeKnjige(brojRacuna, brojKnjige);
		
	}	public static void main(String[] args) {
		option();
	}
}