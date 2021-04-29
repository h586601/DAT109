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

	public Integer getVerdi() {
		return verdi;
	}
	
	public void spill(Kopp kopp) {
		kopp.trill();
		verdi =+ kopp.getSum();
	}
}
