package bilutleie.objekter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import bilutleie.hjelp.Adresse;
import bilutleie.hjelp.Kategori;
import bilutleie.hjelp.Kategorinavn;

public class Kontor {

	private int kontornr;
	private int tlfnr;
	private Adresse adresse;
	private List<Bil> biler;

	public Kontor(int kontornr, int tlfnr, Adresse adresse) {
		this.kontornr = kontornr;
		this.tlfnr = tlfnr;
		this.adresse = adresse;
		biler = new ArrayList<Bil>();
	}

	
	public Set<Kategori> ledigeKategorier() {
		
		Set<Kategori> kategorier = new HashSet<Kategori>();
		
		for(Bil b : biler) {
			if(b.ledig) {
				kategorier.add(b.getKategori());
			}
		}
		
		return kategorier;
	}
	
	public int getKontornr() {
		return kontornr;
	}

	public void setKontornr(int kontornr) {
		this.kontornr = kontornr;
	}

	public int getTlfnr() {
		return tlfnr;
	}

	public void setTlfnr(int tlfnr) {
		this.tlfnr = tlfnr;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public List<Bil> getBiler() {
		return biler;
	}
	
	public void leggTilBil(Bil bil) {
		biler.add(bil);
		bil.setLedig(true);
	}
	
	public void leieUtBil(Bil bil) {
		bil.setLedig(false);
		biler.remove(bil);	
	}

	
	public static void main(String[] args) {
		
		Kontor k = new Kontor(1, 99009900, new Adresse("Gate", 9900, "By"));
		Bil b = new Bil("EL12345", "Audi", "Etron", "Sølv", new Kategori(Kategorinavn.A));
		Bil b2 = new Bil("EL11122", "Audi", "Etron", "Hvit", new Kategori(Kategorinavn.A));
		Bil b3 = new Bil("ST91051", "Volvo", "V60", "Svart", new Kategori(Kategorinavn.D));
	
		k.leggTilBil(b);
		k.leggTilBil(b2);
		k.leggTilBil(b3);
		Reservasjon r = new Reservasjon(k, LocalDate.now(), LocalTime.now(), 2);
		r.visResultat();
	}
}
