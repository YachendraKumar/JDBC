package jdbcprogram;

import java.sql.*;

public class Program1 {

	public static void main(String[] args) throws Exception  {
		
		
		
		String driver = "com.mysql.cj.jdbc.Driver";
		
		String  url   =  "jdbc:mysql://localhost:3306/school";
		
		String username ="root";
		
		String password  ="@Yachi6#";
		
		// Step-1 : Register the driver
		try {
		Class.forName(driver);
		
		//Step-2 : Get Connection
		
		Connection con =  DriverManager.getConnection(url,username,password);
		
		//Step-3 : Create Statement Object
		
		Statement stmt = con.createStatement();
		
		// Step-4 : Execute Queries 
		stmt.executeUpdate("insert into student values(11,'surendra','ECE')");

		//Step-5 : Close the Connection
		
	System.out.println("Record Inserted Successfully");
		
           con.close();
		}
		catch (Exception e){
			System.out.println(e);
		}
          
	
	}

}
