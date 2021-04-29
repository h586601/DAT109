package klasser;

public class Terning {

	private Integer id;
	private Integer verdi;

	public Terning() {
	}

	public Terning(Integer id, Integer verdi) {
		this.id = id;
		this.verdi = verdi;
	}

	public Integer getVerdi() {
		return verdi;
	}

	public void trill() {
		verdi = (int) ((Math.random() * 6) + 1);
		System.out.println(verdi);
	}

}
