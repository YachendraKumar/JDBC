package jdbcprogram;

import java.sql.*;


public class Program3 {
 
	public static void main(String[] args) throws Exception{
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","@Yachi6#");
        Statement stmt = con.createStatement();
        ResultSet rs =stmt.executeQuery("select * from student");
		System.out.println("rollno name       branch");
		while(rs.next()) {
		System.out.println(rs.getInt("rollno")+"    "+ rs.getString("name")+"   "+ rs.getString("branch"));
		
		}
		con.close();
	}
       catch(Exception e) {
    	   e.printStackTrace();
       }
}
}