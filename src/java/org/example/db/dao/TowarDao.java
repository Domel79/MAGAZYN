package java.org.example.db.dao;

import java.org.example.db.Dao;
import java.org.example.magazyn.Towar;

public interface TowarDao extends Dao<Towar>{
	
	public void setStany(Towar t);
}
