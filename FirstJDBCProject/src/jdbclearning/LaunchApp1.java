package jdbclearning;
import java.sql.*;
public class LaunchApp1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		//load and register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//establish the connection
		String url="jdbc:mysql://localhost:3306/jdbc_learning";
		String user="root";
		String password="Divya1103";
		Connection connect = DriverManager.getConnection(url,user,password);
		
		//creating statement
		Statement statement = connect.createStatement();
		//execute query-> inserting the recorfs into db through java app
		String sql = "insert into StudentInfo(id,sname,sage,scity) values(4,'Divi', 13, 'Purnia')";
		int rowsAffected = statement.executeUpdate(sql);//.executeUpdate(sql) method returns int type
		//process the result
		if(rowsAffected == 3) {
			System.out.println("unable to insert data");
		}else {
			System.out.println("Data Inserted successfully");
		}
		//close the resources
		
		statement.close();
		connect.close();
		
		

	}

}
