package Database;

import java.sql.DriverManager;
import java.sql.*;

public class dBManager {
//database credentials
	String database = "jdbc:mysql://localhost:3306/world";
	String username = "dbadmin";
	String password = "dbpass";

// get database connection
	// @return Connection connection
	public Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(database,username,password);
		} catch(ClassNotFoundException | SQLException e) {
			System.out.println("Error Getting Connection: "+e);
		}
		return connection;
	}
	
	//execute query against database
	//@param sqlStmt Sql statement
	//@return ResultSet resultSet
	
	public ResultSet executeQuery(String sqlStmt) {
		ResultSet resultSet = null;
		try {
			Connection connection = getConnection();
			
			if(connection != null) {
				Statement statement = connection.createStatement();
				resultSet = statement.executeQuery(sqlStmt);
			}
			
		}catch(SQLException e) {
			System.out.println("Error Executing Query: " + sqlStmt + ", Error: " +e);
		}
		return resultSet;
	}
	
	//execute update on database
	//@param sqlStmt SQL statement
	//@return Integer rowCount
	
	public int executeUpdate(String sqlStmt) {
		int rowCount = 0;
		try {
			Connection connection = getConnection();
			 if(connection != null) {
			        Statement statement = connection.createStatement();
			        rowCount = statement.executeUpdate(sqlStmt);
			      }
		}catch(SQLException e) {
			System.out.println("Error Executing Update: " +sqlStmt+ ", Error: "+e);
		}
		return rowCount;
	}
	
	
	
	
	
	
	
	
	
	
}
