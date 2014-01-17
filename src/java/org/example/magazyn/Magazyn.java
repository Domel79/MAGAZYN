package org.example.magazyn;

import java.util.List;

import org.example.db.EntityBase;

public class Magazyn extends EntityBase {

	
	
	private String kod;
	private String nazwa;
	

	//relacja magazyn-stan
	public List<Stany> stany;
	
	public List<Stany> getStany() {
		return stany;
	}
	public void setStany(List<Stany> stany) {
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

	
}
