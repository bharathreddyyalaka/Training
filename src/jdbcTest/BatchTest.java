package jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver");
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","root");
		Statement st = c.createStatement();
		System.out.println("Before creating");
		st.addBatch("update customer set customer_name = 'Bharath Reddy' where customer_name = 'Bharath'");
		
		st.addBatch("delete from customer where customer_name = 'manoj'");
		st.addBatch("insert into customer values(2,'manoj','abc','abc@gamil.com')");
		
		st.executeBatch();
		System.out.println("executed Batch");
		c.close();
	}

}
