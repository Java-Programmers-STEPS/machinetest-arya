package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectRecord {
public static void main(String args[]) throws ClassNotFoundException, SQLException {
	Class.forName(DatabaseConnection.Driver);
	Connection con = DriverManager.getConnection(DatabaseConnection.Connectionurl, DatabaseConnection.Username,
			DatabaseConnection.password);
	PreparedStatement smt= con.prepareStatement("select *  from product");
	ResultSet rs=smt.executeQuery();
	while (rs.next()) {
		System.out.println("id " + rs.getInt(1)+" name "
	+rs.getString(2)+" price "+rs.getInt(3)+" quantity "+rs.getInt(4)+ " description "+rs.getString(5));
	}

}
}