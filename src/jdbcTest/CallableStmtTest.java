package jdbcTest;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CallableStmtTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver");
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","root");
		CallableStatement cs = c.prepareCall("{call Insert_into_customer(?,?,?,?)}");
		System.out.println("called Procedure");
		cs.setInt(1, 5);
		cs.setString(2, "Brun");
		cs.setString(3, "abcd");
		cs.setString(4, "brun@gmail.com");
		
		cs.execute();
		System.out.println("Inserted");
		c.close();
		}
		catch(Exception e){
			
			System.out.println(e);
			
		}
		
	}

}
