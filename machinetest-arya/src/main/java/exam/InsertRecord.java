package exam;

import java.sql.*;
import java.sql.DriverManager;

public class InsertRecord {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		Class.forName(DatabaseConnection.Driver);
		Connection con = DriverManager.getConnection(DatabaseConnection.Connectionurl, DatabaseConnection.Username,
				DatabaseConnection.password);
		PreparedStatement smt = con.prepareStatement("insert into product values(?,?,?,?,?)");

		smt.setInt(1, 600);
		smt.setString(2, "soap");
		smt.setInt(3, 65);
		smt.setInt(4, 10);
		smt.setString(5, "lex");
		int result = smt.executeUpdate();
		System.out.println(result + " successs");

	}

}