package bilutleie.objekter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

import bilutleie.hjelp.Kategori;

public class Reservasjon {

	Kontor sted;
	LocalDate dato;
	LocalTime klokkeslett;
	int antallDager;
	
	public Reservasjon(Kontor sted, LocalDate dato, LocalTime klokkeslett, int antallDager) {
		this.sted = sted;
		this.dato = dato;
		this.klokkeslett = klokkeslett;
		this.antallDager = antallDager;
	}

	public void visResultat() {
		
		for(Kategori kategori : sted.ledigeKategorier()) {
			System.out.println(kategori.getNavn());
			System.out.println(kategori.getDagspris()*antallDager);
		}
	}
	
	public Kontor getSted() {
		return sted;
	}

	public void setSted(Kontor sted) {
		this.sted = sted;
	}

	public LocalDate getDato() {
		return dato;
	}

	public void setDato(LocalDate dato) {
		this.dato = dato;
	}

	public LocalTime getKlokkeslett() {
		return klokkeslett;
	}

	public void setKlokkeslett(LocalTime klokkeslett) {
		this.klokkeslett = klokkeslett;
	}

	public int getAntallDager() {
		return antallDager;
	}

	public void setAntallDager(int antallDager) {
		this.antallDager = antallDager;
	}
	
	
	
}
