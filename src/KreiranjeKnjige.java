

import java.util.ArrayList;
import java.util.Scanner;

public class KreiranjeKnjige {

	int brojKnjige;
	String imeKnjige;
	boolean statusKnjige;
	
public KreiranjeKnjige() {
			
		}
private static ArrayList<KreiranjeKnjige> array = new ArrayList<>();

public KreiranjeKnjige(int brojKnjige, String imeKnjige, boolean statusKnjige) {
	if(knjiga()==true) {
	this.brojKnjige = brojKnjige;
	this.imeKnjige = imeKnjige;
	this.statusKnjige = statusKnjige;
	array.add(this);
	System.out.println("Racun je uspjesno kreiran!");
	}else {
		System.out.println("Racun nije kreiran!");
	}
}
	public static boolean knjiga() {
		Scanner input=new Scanner(System.in);
		System.out.println("Unesite novi broj racuna:");
		int brojKnjige=input.nextInt();
		while(brojKnjige<0) {
		System.out.println("Broj knjige ne smije biti negativan. Ponovite unos");
				brojKnjige=input.nextInt();
			}
			for(int i = 0; i < array.size(); i++) {
				if(array.get(i).brojKnjige == brojKnjige){
					System.out.println("Racun se ne moze kreirati jer broj knjige vec postoji!");
					return false;
				}
				}
			return true;
		}
		
}
