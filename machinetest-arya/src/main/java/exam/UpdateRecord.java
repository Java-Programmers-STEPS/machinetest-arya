package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateRecord {

	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		Class.forName(DatabaseConnection.Driver);
		Connection con = DriverManager.getConnection(DatabaseConnection.Connectionurl, DatabaseConnection.Username,
				DatabaseConnection.password);
		PreparedStatement smt = con.prepareStatement("update product set name=? where id=?");

		smt.setString(1, "mop");
		
		smt.setInt(2, 500);
		int result = smt.executeUpdate();
		System.out.println(result + " updated successfully");

	}
}
