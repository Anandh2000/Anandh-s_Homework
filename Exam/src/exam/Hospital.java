package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Hospital {

	public static void main(String[] args) throws Exception {
		Hospital h = new Hospital();
		System.out.println("Enter Doctor/Clerk to show available details");
		Scanner sc = new Scanner(System.in);
		String ame = sc.next();
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "1234");
		String query = "select * from "+ame+";";
	
		Statement p = con.createStatement();
		ResultSet rr = p.executeQuery(query);
		if(ame == "Doctor") {
		while(rr.next()) {
			System.out.println(rr.getInt(1)+":"+rr.getString(2)+":"+rr.getInt(3)+":"+rr.getString(4));
		}
		}
		else {
			while(rr.next()) {
				System.out.println(rr.getInt(1)+":"+rr.getString(2)+":"+rr.getString(3));
			}
		}
		p.close();
		con.close();
		
			}
}

