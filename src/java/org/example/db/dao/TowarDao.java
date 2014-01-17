package org.example.db.dao;

import org.example.db.Dao;
import org.example.magazyn.Towar;

public interface TowarDao extends Dao<Towar>{
	
	public void setStany(Towar t);
}
