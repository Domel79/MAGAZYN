package java;

import java.org.example.db.HsqlUnitOfWork;
import java.org.example.db.dao.MagazynDao;
import java.org.example.db.dao.HsqlMagazynDao;
import java.org.example.magazyn.Magazyn;



public class Main {

	public static void main(String[] args) {
		
		
		
			HsqlUnitOfWork uow = new HsqlUnitOfWork();

			MagazynDao dao = new HsqlMagazynDao(uow);
			Magazyn m = new Magazyn();
			
			m.setKod("PODSTAWOWY");
			m.setNazwa("Magazyn wyrobów podstawowych");
			m.setId(0);

			uow.commit();
			uow.close();
			
		System.out.println("koniec");
	}

}
