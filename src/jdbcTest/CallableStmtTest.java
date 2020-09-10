package jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;

public class CallableStmtTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver");
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","root");
	}

}
