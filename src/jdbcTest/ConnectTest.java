package jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver");
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","root");
		Statement st = c.createStatement();
		System.out.println("Before creating");
		//st.execute("insert into customer values(3,'manoj','abc','abc@gamil.com')");
		st.execute("update customer set customer_name = 'Manoj Reddy' where customer_name = 'manoj'");
		st.execute("delete from customer where id = 3");
		
		System.out.println("inserted");
		
		ResultSet r = st.executeQuery("select * from customer;");
		
		while(r.next()){
			System.out.println(r.getInt("id"));
			System.out.println(r.getString("customer_name"));
			System.out.println(r.getString("email_id"));
		}
		c.close();
	}

}
