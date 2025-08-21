package com.session7.jdbc.ex1;
import java.sql.*;
public class DemoJdbc {

	public static void main(String[] args) {
		
		//mysql --> oracle
		
		//1. load the driver
		// connection factory aka factory dp
		// property file so that conn that freq change 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver is loaded");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//2. u need to create jdbc conn java -->db tcp/ip
		try {
			Connection connection=DriverManager
					.getConnection("jdbc:mysql://localhost:3306/rajora", "root", "root");
			//3. featch the records print all product information on console of java app
			//Statment vs PreprapredStatment vs CallableStatement
			// simple		faster 					store procedure
			Statement stmt=connection.createStatement();
			//executeQuery vs executeUpdate
			//use to featch vs insert/update/delete
			
			//Jdbc --> ORM hibernate 
			ResultSet rs= stmt.executeQuery("select * from product");
			//how as java dev i come to know about the database or table st
			while(rs.next()) {
				System.out.println(rs.getInt("id")+": "+rs.getString("name")+": "+ rs.getDouble("price"));
			}
					
					
			System.out.println("conn is done");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
