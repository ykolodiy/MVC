package servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Model {
	
	String[] myArray;
	
	
	//lets create constructor and pull data from db
	public Model () {
		
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://ec2-54-202-52-81.us-west-2.compute.ama..);  
		
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from RegisteredUsers");  
			
			List<String> u = new ArrayList<String>();
			while(rs.next())  
			{
			System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			u.add(rs.getString(2));
			}
			con.close();  
			
			System.out.println(Arrays.toString(u.toArray()));
			myArray = u.toArray(new String[u.size()]);
			}catch(Exception e){ System.out.println(e);} 
		
		
		
	}
	
	
	
	
	
	
	//this method check if in input form username the same as in db
	public boolean uu (String s, String p) {
		
		if (Arrays.asList(myArray).contains(s) && p != "") {return true;}
		return false;
	}
	
	//we gonna select uname from mysql and push it to user object and use it later
public User getUserObject (String s) {
		String uname = s;
		User user = new User ();
		
	try{  
			
		
			
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://ec2-54-202-52-81.us-west-2.compute.amazonaws.c");  
		
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from RegisteredUsers where Username="+"\'"+uname+"\'");  
			
		
			while(rs.next())  
			{
			
			user.setUsername(rs.getString(2));
			user.setID(rs.getString(1));
			user.setEmail(rs.getString(4));
			user.setPassword(rs.getString(3));
			
			System.out.println(user.getEmail()+" "+user.getID()+" "+user.getUsername());
		
			}
			con.close();  
			
		
			}catch(Exception e){ System.out.println(e);} 
		
		
		
		
		
		
		
		
		
		return user;
		
		
	}
	
	
	
	
}
