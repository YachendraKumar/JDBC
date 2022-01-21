package jdbcprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","@Yachi6#");
			PreparedStatement pst = con.prepareStatement("insert into student values(?,?,?)");
	        Scanner s =new Scanner (System.in);
	    while(true) {
		System.out.println("Enter Student  Roll no ");
		int rollno = s.nextInt();
		System.out.println("Enter Student Name ");
		s.nextLine();
		String name = s.nextLine();
		System.out.println("Enter Student branch");
		String branch =s.nextLine();
		pst.setInt(1,rollno);
		pst.setString(2, name);
		pst.setString(3,branch);
		pst.executeUpdate();
		System.out.println("Record Inserted Sucessfully");
		System.out.println("Do you want to insert one more record [Y/N]");
		String option =s.nextLine();
		if(option.equalsIgnoreCase("N")) {
			break;
			
		}
	}
	s.close();
	          }
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
}
}