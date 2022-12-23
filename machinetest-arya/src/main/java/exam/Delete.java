package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Delete {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		Class.forName(DatabaseConnection.Driver);
		Connection con = DriverManager.getConnection(DatabaseConnection.Connectionurl, DatabaseConnection.Username,
				DatabaseConnection.password);
		PreparedStatement smt=con.prepareStatement("delete from product where id=600");
		int c= smt.executeUpdate();
		System.out.println(c+" delete");
}
} 