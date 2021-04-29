package klasser;

public class Spiller {

	private String navn;
	private Integer verdi;
	
	public Spiller(String navn) {
		this.navn = navn;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public Integer getVerdi() {
		return verdi;
	}

	public void setVerdi(Integer verdi) {
		this.verdi = verdi;
	}

	public void spill(Kopp kopp) {
		kopp.trill();
		verdi =+ kopp.getSum();
	}
}
