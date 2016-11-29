package RAS;
import java.sql.*;

public class Driver {
	
	public static Connection myConn;
	public static String url = "jdbc:mysql://localhost:3306/RAS?autoReconnect=true&useSSL=false";
	public static String username = "root";
	public static String password = ""; //enter password here
	
	
	public static Connection getConnection() {
		
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
			//1: Get Connection to DB
			myConn = DriverManager.getConnection(url,username,password);
			//myStat = myConn.createStatement();
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return myConn;
	}

}
