package com.app;

import java.sql.*;

public class A_HelloWorld {

	public static void main(String[] args) {

		// to print all the emp records
		// 1. load the jdbc driver
		
		Connection connection =null;
		try {
			 
			connection=	
					DriverManager
					.getConnection("jdbc:mysql://localhost:3306/sunlife", "root", "root");

			// Statement vs PreparedStatement vs CallableStatement
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("select * from emp");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + ": " +
							rs.getString(2) + ": " + rs.getDouble(3));
			}
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}

//how a class can be loaded in java
//static vs dynamic class loading

//Dog d=new Dog();//static class loading
//Class<?> clazz=
//Class.forName("com.day5.session2.jdbc.Dog");
