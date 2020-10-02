package db;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Accounts extends BankDB{

	public Accounts() throws ClassNotFoundException, SQLException {
	
		super();
		// TODO Auto-generated constructor stub
	}
	public void insert(int accNo, String name, String type, float balance, String password , String Adhaar) throws SQLException {
		
		String sql = "insert into accounts values("+accNo+",'"+name+"','"+type+"',"+balance+",'"+password+"','"+Adhaar+"')";
		DataRequest.executeUpdate(sql);
	}
	public void delete(int accNo) throws SQLException {
		String sql = "delete from accounts where AccNo = "+accNo;
		DataRequest.executeUpdate(sql);
	}
	public void update(int accNo, String name, String type, float balance, String password , String Adhaar) throws SQLException {
		String sql = "update accounts "+" set name='"+name+"', type='"+type+"',password ='"+password+"', AdhaarCardNo='"+Adhaar+"' where AccNo = "+accNo;
		DataRequest.executeUpdate(sql);
	}
	public String[][] selectAll() throws SQLException{
		String sql = "Select * from accounts";
		
		ResultSet rows = DataRequest.executeQuery("Select count(*) from accounts");
		rows.next();
		String[][] tab = new String[rows.getInt(1)][6];
		rows.close();
		ResultSet rs = DataRequest.executeQuery(sql);
		int i = 0;
		while(rs.next()) {
			tab[i][0] = (rs.getInt(1))+"";
			tab[i][1] = rs.getString(2);
			tab[i][2] = rs.getString(3);
			tab[i][3] = (rs.getFloat(4))+"";
			tab[i][4] = rs.getString(5);
			tab[i][5] = rs.getString(6);
			i++;
		}
		return tab;
	}
	public boolean Authenticate(String accno, String password) throws SQLException {
		String sql = "select * from accounts where accno='"+accno+"'and password='"+password+"'";
		ResultSet r = DataRequest.executeQuery(sql);
		
		if(r.next()) {
			return true;
		}
		return false;
	}
	public String[] select(int accno) throws SQLException {
		String[] res = new String[6];
		String sql = "select * from accounts where accno='"+accno+"'";
		ResultSet rs = DataRequest.executeQuery(sql);
		rs.next();
		res[0] = ""+accno;
		res[1] = rs.getString(2);
		res[2] = rs.getString(3);
		res[3] = rs.getString(4);
		res[4] = rs.getString(5);
		res[5] = rs.getString(6);
		return res;
	}
	public void deposite(int accno, float amount) throws SQLException {
		String sql = "update accounts set balance = (select balance from accounts where accno = "+accno+")+"+amount+" where accno="+accno;
		DataRequest.executeUpdate(sql);
		
	}
	public void withdraw(int accno, float amount) throws SQLException {
		String sql = "update accounts set balance = (select balance from accounts where accno = "+accno+")-"+amount+" where accno="+accno;

		DataRequest.executeUpdate(sql);
		
	}
	public void transfer(int fromaccno, int toaccno, float amount) throws SQLException {
		String sql = "update accounts set balance = (select balance from accounts where accno = "+fromaccno+")-"+amount+" where accno="+fromaccno;
		DataRequest.executeUpdate(sql);
		sql = "update accounts set balance = (select balance from accounts where accno = "+toaccno+")+"+amount+" where accno="+toaccno;
		DataRequest.executeUpdate(sql);
	}
}
