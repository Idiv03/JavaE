package jdbclearning;
import java.sql.*;
public class LaunchApp3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");//This line loads the MySQL JDBC driver to enable database connectivity.
		//establish the connection
		String url="jdbc:mysql://localhost:3306/jdbc_learning";
		String user="root";
		String password="Divya1103";
		Connection connect = DriverManager.getConnection(url,user,password);
		
		//creating statement
		Statement statement = connect.createStatement();
		//execute query-> retrieve data from database to java application
		
		String sql = "select * from studentinfo";
		ResultSet rs = statement.executeQuery(sql);
		//process the result
		
		while(rs.next()) {
			int id = rs.getInt(1);
			String sage = rs.getString(2);
			//System.out.println(rs.getInt(1)+ " "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
			//System.out.println(rs.getInt("id")+ " "+rs.getString("sname")+" "+rs.getInt("sage")+" "+rs.getString("scity"));
			System.out.println(id+" "+sage);
		}
	
		//close the resources
		rs.close();
		statement.close();
		connect.close();

	}

}

/*
 * statement.close();

connect.close();

These lines close the Statement and Connection objects to free up resources.
 */

