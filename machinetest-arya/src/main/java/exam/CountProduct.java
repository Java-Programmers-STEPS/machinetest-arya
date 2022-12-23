package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CountProduct {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(DatabaseConnection.Driver);
		Connection con = DriverManager.getConnection(DatabaseConnection.Connectionurl, DatabaseConnection.Username,
				DatabaseConnection.password);
		PreparedStatement smt= con.prepareStatement("select count(*)  from product");
	
		ResultSet result = smt.executeQuery();
		result.next();
		int c=result.getInt(1);
		
		System.out.println(c);


	}

}
