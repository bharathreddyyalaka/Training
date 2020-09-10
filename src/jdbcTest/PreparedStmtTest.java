package jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStmtTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver");
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","root");
		PreparedStatement ps = c.prepareStatement("insert into customer(id,customer_name,password,email_id) values (?,?,?,?)");
		ps.setInt(1, 3);
		ps.setString(2, "mars");
		ps.setString(3, "bruno");
		ps.setString(4, "brunoMars@gmail.com");
		ps.executeUpdate();
		System.out.println("prepared stmt inserted");
		
		ps.close();
		System.out.println("prepared stmt closed");
		c.close();
	}

}
