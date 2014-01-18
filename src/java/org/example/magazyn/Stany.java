package java.org.example.magazyn;

import java.util.List;

import java.org.example.db.EntityBase;

public class Stany extends EntityBase {
	
	private Double stan;
	private Double stanMinimalny;
	
	//relacja stany - magazyn
	private Magazyn magazyn;
	//relacja stany - towar
	private List<Towar> towary;
	
	public Magazyn getMagazyn() {
		return magazyn;
	}
	public void setMagazyn(Magazyn magazyn) {
		this.magazyn = magazyn;
	}
	public Double getStan() {
		return stan;
	}
	public void setStan(Double stan) {
		this.stan = stan;
	}
	public Double getStanMinimalny() {
		return stanMinimalny;
	}
	public void setStanMinimalny(Double stanMinimalny) {
		this.stanMinimalny = stanMinimalny;
	}
	
	
	
}
