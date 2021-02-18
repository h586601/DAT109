package bilutleie.hjelp;

public class Kategori {

	Kategorinavn navn;
	double dagspris;
	
	public Kategori(Kategorinavn navn) {
		this.navn = navn;
		
		switch(this.navn) {
		case A:
			this.dagspris = 400;
			break;
		case B:
			this.dagspris = 450;
			break;
		case C:
			this.dagspris = 500;
			break;
		case D:
			this.dagspris = 550;
			break;
		}
	}

	public String getNavn() {
		String navn = "";
		
		switch(this.navn) {
		case A:
			navn = "Liten bil";
			break;
		case B:
			navn = "Mellomstor bil";
			break;
		case C:
			navn = "Stor bil";
			break;
		case D:
			navn = "Stasjonsvogn";
			break;
		default:
			navn = "Feil";
		}
		return navn;
	}

	public double getDagspris() {
		return dagspris;
	}

	public void setDagspris(double dagspris) {
		this.dagspris = dagspris;
	}
}
