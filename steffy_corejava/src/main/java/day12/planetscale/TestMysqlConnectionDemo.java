package day12.planetscale;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestMysqlConnectionDemo {
public static void main(String[] args) throws SQLException {
	
	 String url = "jdbc:mysql://aws.connect.psdb.cloud:3306/core";
     String userName = "m2dzcqx41w74o1zq4mc7";
     String password = "pscale_pw_RKCGNKM3vyaPVzj11WhnsDcGSayDXckNDtNJrv1XY5x";

	Connection con = DriverManager.getConnection(url, userName, password);
	
	System.out.println("connection created...");
    con.close();

}
}