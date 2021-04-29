package klasser;

import java.util.ArrayList;
import java.util.List;

public class Kopp {

	private Integer id;
	private Integer sum;
	private static final int ANTALL_TERNINGER = 2;
	private List<Terning> terninger = new ArrayList<>();

	public Kopp() {
		for (int i = 0; i < ANTALL_TERNINGER; i++) {
			terninger.add(new Terning());
		}
	}

	public void trill() {
		sum = 0;
		for(Terning terning : terninger) {
			terning.trill();
			sum += terning.getVerdi();
		}
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}
}
