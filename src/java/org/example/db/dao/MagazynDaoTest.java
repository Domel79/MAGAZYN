package java.org.example.db.dao;

import java.org.example.db.HsqlUnitOfWork;
import java.org.example.magazyn.Magazyn;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;


public class MagazynDaoTest {

	MagazynDao dao;

	Connection connection = null;
	private Statement drop;
	
	@BeforeClass
	public static void initialize()
	{}
	
	@Before
	public void setUp()
	{

		Magazyn m = new Magazyn();
		m.setKod("PODSTAWOWY");
		m.setNazwa("Magazyn wyrobów podstawowych");
		try {

			HsqlUnitOfWork uow = new HsqlUnitOfWork();
			dao = new HsqlMagazynDao(uow);
			dao.save(m);
			uow.commit();
			drop = uow.getConnection().createStatement();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@After
	public void teardown()
	{
		try{
			if(connection!=null && !connection.isClosed())
			{	
				drop.executeUpdate("Drop table Magazyn");
				connection.close();
				connection = null;
			}}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
	}
	
	@Test
	public void testGet() {
		
		Magazyn m1 = dao.get(0);
		Magazyn m2 = dao.get(2);
		Magazyn m3 = dao.get(0);
		
		assertNotNull("Zwrocono null mimo ze obiekt jest w bazie",m1);
		assertNull("Zwrocono wartosc mimo, że nie ma takiego obiektu w bazie",m2);
		assertTrue(m1.getKod().equals("PODSTAWOWY."));
		
		assertEquals(m1.getKod(),"PODSTAWOWY");
		assertEquals(m1.getNazwa(), "Magazyn wyrobów podstawowych");

		
		assertNotSame(m1,m3);
		
	}

}
