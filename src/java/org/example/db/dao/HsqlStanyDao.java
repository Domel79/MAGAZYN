package java.org.example.db.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.org.example.db.HsqlUnitOfWork;
import java.org.example.magazyn.Stany;

public class HsqlStanyDao extends HsqlDaoBase<Stany> {

	
	public HsqlStanyDao(HsqlUnitOfWork uow) {
		super(uow);
	}


	@Override
	protected void setUpdateQuery(Stany ent) throws SQLException {

		update.setDouble(1, ent.getStan());
		update.setDouble(2, ent.getStanMinimalny());
		update.setInt(3, ent.getId());
		
	}

	@Override
	protected Stany build(ResultSet rs) throws SQLException {

		Stany s = new Stany();
		s.setStan(rs.getDouble("stan"));
		s.setStanMinimalny(rs.getDouble("stanMinimalny"));
		s.setId(rs.getInt("id"));
		return s;
	}

	@Override
	protected void setInsertQuery(Stany ent) throws SQLException {
		insert.setDouble(1, ent.getStan());
		insert.setDouble(2, ent.getStanMinimalny());
		
	}

	@Override
	protected String getTableName() {
		return "stany";
	}

	@Override
	protected String getCreateQuery() {
		return "CREATE TABLE stany("
				+ "id bigint GENERATED BY DEFAULT AS IDENTITY,"
				+ "stan DOUBLE(15,3),"
				+ "stanMinimalny DOUBLE(15,3)"
				+ ")";
	}

	@Override
	protected String getInsertQuery() {
		return "insert into stany(stan,stanMinimalny) values (?,?)";
	}

	@Override
	protected String getUpdateQuery() {
		return "update stany set"
				+ "(stan,stanMinimalny)=(?,?)"
				+ "where id=?";
	}


	

}
