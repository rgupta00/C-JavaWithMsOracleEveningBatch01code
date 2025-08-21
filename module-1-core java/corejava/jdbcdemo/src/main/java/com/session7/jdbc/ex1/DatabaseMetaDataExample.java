package com.session7.jdbc.ex1;
import java.sql.*;

public class DatabaseMetaDataExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/rajora"; // replace with your DB
        String user = "root";
        String password = "root";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            // Get metadata object
            DatabaseMetaData metaData = conn.getMetaData();

            // Print general database information
            System.out.println("Database Product Name: " + metaData.getDatabaseProductName());
            System.out.println("Database Product Version: " + metaData.getDatabaseProductVersion());
            System.out.println("Database Major Version: " + metaData.getDatabaseMajorVersion());
            System.out.println("Database Minor Version: " + metaData.getDatabaseMinorVersion());

            // Print driver information
            System.out.println("Driver Name: " + metaData.getDriverName());
            System.out.println("Driver Version: " + metaData.getDriverVersion());
            System.out.println("JDBC Major Version: " + metaData.getJDBCMajorVersion());
            System.out.println("JDBC Minor Version: " + metaData.getJDBCMinorVersion());

            // Print available tables
            System.out.println("\n=== Tables in Database ===");
            ResultSet tables = metaData.getTables(null, null, "%", new String[]{"TABLE"});
            while (tables.next()) {
                System.out.println("Table: " + tables.getString("TABLE_NAME"));
            }

            // Print columns of a specific table (say "employee")
            System.out.println("\n=== Columns in 'employee' Table ===");
            ResultSet columns = metaData.getColumns(null, null, "employee", "%");
            while (columns.next()) {
                System.out.println("Column: " + columns.getString("COLUMN_NAME") +
                        " | Type: " + columns.getString("TYPE_NAME") +
                        " | Size: " + columns.getInt("COLUMN_SIZE"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
