package db;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Admin extends BankDB{

	public Admin() throws ClassNotFoundException, SQLException {
		super();
		// TODO Auto-generated constructor stub
	}
	public boolean Authenticate(String adminid, String password) throws SQLException {
		String sql = "select * from admin where adminid='"+adminid+"'and pass='"+password+"'";
		ResultSet r = DataRequest.executeQuery(sql);
		
		if(r.next()) {
			return true;
		}
		return false;
	}

}
