package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class BankDB {
	public Statement DataRequest;
	public static Connection conn;
	public String Query;
	public static int no_of_tables = 18;
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank?serverTimezone=UTC#", "root", null);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	public BankDB() throws ClassNotFoundException, SQLException {
		DataRequest = conn.createStatement();
	}
	protected void finalize() throws Throwable{
		DataRequest.close();
	}
	public int getRowCount(ResultSet rs) throws SQLException {
		int n = 0;
		while(rs.next())
			n++;
		rs.first();
		rs.previous();
		return n;
	}
}
