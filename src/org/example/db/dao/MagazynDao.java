package org.example.db.dao;

import org.example.db.Dao;
import org.example.magazyn.Magazyn;

public interface MagazynDao extends Dao<Magazyn>{
	
	public void setStany(Magazyn m);
}
