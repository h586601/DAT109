package bilutleie.objekter;

import bilutleie.hjelp.Kategori;

public class Bil {

	String regnr;
	String merke;
	String modell;
	String farge;
	Kategori kategori;
	boolean ledig;
	
	public Bil(String regnr, String merke, String modell, String farge, Kategori kategori) {
		this.regnr = regnr;
		this.merke = merke;
		this.modell = modell;
		this.farge = farge;
		this.kategori = kategori;
		this.ledig = true;
	}

	
	public boolean isLedig() {
		return ledig;
	}

	public void setLedig(boolean ledig) {
		this.ledig = ledig;
	}
	
	public String getFarge() {
		return farge;
	}

	public String getRegnr() {
		return regnr;
	}

	public String getMerke() {
		return merke;
	}

	public String getModell() {
		return modell;
	}

	public Kategori getKategori() {
		return kategori;
	}
	
	
	
}
