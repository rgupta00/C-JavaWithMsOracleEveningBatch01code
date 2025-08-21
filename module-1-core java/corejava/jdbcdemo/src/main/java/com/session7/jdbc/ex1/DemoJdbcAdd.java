package com.session7.jdbc.ex1;

import java.sql.*;

public class DemoJdbcAdd {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver is loaded");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/rajora", "root", "root");

			//Statement vs 			PrepareadedStatement
			//sql injections	 vs no sql injections+ faster
			
			PreparedStatement stmt = 
					connection.prepareStatement("insert into product(name, price) values (?,?)");
			stmt.setString(1, "pen stand");
			stmt.setDouble(2,790.00);
			
			//executeQuery(rs) vs executeUpdate(no of tuples effected)
			int noOfRowsEffected =stmt.executeUpdate();
			
			System.out.println(noOfRowsEffected);
			System.out.println("conn is done");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
