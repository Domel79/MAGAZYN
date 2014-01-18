package org.example.magazyn;

import org.example.db.EntityBase;

public class Towar extends EntityBase{
	
	private String kod;
	private String nazwa;
	private double cena;
	
	//relacje towar - stany
	private Stany stany;
	
	public Stany getStany() {
		return stany;
	}
	
	public void setStany(Stany stany) {
		this.stany = stany;
	}
	
	public String getKod() {
		return kod;
	}
	public void setKod(String kod) {
		this.kod = kod;
	}
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	
	
}
