package klasser;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;



public class Terningspill {

	private Integer id;
	private Kopp kopp;
	private List<Spiller> spillere = new ArrayList<>();
	
	public Terningspill() {
		kopp = new Kopp();
	}

	public Terningspill(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public List<Spiller> getSpillere() {
		return spillere;
	}

	public void setSpillere(List<Spiller> spillere) {
		this.spillere = spillere;
	}
	
	public static Terningspill lagSpill() {
		return new Terningspill();
	}
	
	public void leggTilSpiller(String navn) {
		Spiller spiller = new Spiller(navn);
		spillere.add(spiller);
	}
	
	private void spill() {
		System.out.println("Starter spillet");

		for(Spiller spiller : spillere) {
			System.out.println(spiller.getNavn() + " triller terningene...");
			spiller.spill(kopp);
		}

		Spiller vinner = spillere.stream()
				.max(Comparator.comparing(Spiller::getVerdi))
				.get();
		
		System.out.println("Vinneren er " + vinner.getNavn());
	}
	
	
	
	public static void main(String[] args) {
		Terningspill spill = lagSpill();
		
		System.out.println("Skriv navn på hver spiller adskilt med Enter");
		System.out.println("Trykk på Enter to ganger når du har skrevet inn alle spillerne");
		String navn = null;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Navn: ");
			navn = scan.nextLine();
			if(navn != "")
				spill.leggTilSpiller(navn);
		} while (navn != "");
		
		scan.close();
		
		spill.spill();
		
	}

	

	
}
