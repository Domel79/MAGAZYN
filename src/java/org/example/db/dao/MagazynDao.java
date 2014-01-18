package java.org.example.db.dao;

import java.org.example.db.Dao;
import java.org.example.magazyn.Magazyn;

public interface MagazynDao extends Dao<Magazyn>{
	
	public void setStany(Magazyn m);
}
