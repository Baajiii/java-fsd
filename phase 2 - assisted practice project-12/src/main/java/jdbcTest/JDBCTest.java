package jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {

	public static void main(String[] args) {
		readFromDb();

	}
		
	private static void readFromDb() {
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "Samsudeen21");
				Statement statement = connection.createStatement();){
			
			ResultSet resultSet = statement.executeQuery("select * from account");
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + ", " + resultSet.getString(2) + ", " + resultSet.getString(3)
						+ ", " + resultSet.getInt(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
	}
	

	}

