package jdbclearning;
import java.sql.*;
public class LaunchApp2 {

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
		//execute query-> updating data in db from java app
		String sql = "UPDATE StudentInfo set sage=12 where id=3"; 
		int rowsAffected = statement.executeUpdate(sql);//.executeUpdate(sql) method returns int type
		//process the result
		if(rowsAffected == 1) {
			System.out.println("update successful");
		}else {
			System.out.println("update failed");
		}
		//close the resources
		
		statement.close();
		connect.close();

	}

}

/*
 * statement.close();

connect.close();

These lines close the Statement and Connection objects to free up resources.
 */

