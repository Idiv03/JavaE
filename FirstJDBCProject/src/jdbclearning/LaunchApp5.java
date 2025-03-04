package jdbclearning;
import java.sql.*;
public class LaunchApp5 {

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
		
		//String sql = "select * from StudentInfo"; 
		String sql = "update studentinfo set sage = 16 where id = 1";
		//execute query-> updating data in db from java app
		 
		boolean status = statement.execute(sql);
		
		//process the result
		if(status) {
			System.out.println("if block");//to debug
			ResultSet rs = statement.getResultSet(); 
			while(rs.next()) {
				System.out.println(rs.getInt(1)+ " "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
			}
		}else {
			System.out.println("else block");//to debug
			//insert, update, delete
			int rows = statement.getUpdateCount();
			if(rows == 0)
				System.out.println("Opertion failed");
			else
				System.out.println("operation successful");
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

