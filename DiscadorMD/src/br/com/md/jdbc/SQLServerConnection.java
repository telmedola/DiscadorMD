package br.com.md.jdbc;

import java.sql.*;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;

public class SQLServerConnection {
	public Connection getConnection() throws ClassNotFoundException {
		String connectionUrl = "jdbc:sqlserver://10.0.10.161:1433;" + 
	"databaseName=COBRACAP;integratedSecurity=false;";

		try {
//			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			return DriverManager.getConnection(connectionUrl, "sa", "prog@123");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
