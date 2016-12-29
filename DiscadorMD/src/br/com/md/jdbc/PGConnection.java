package br.com.md.jdbc;

import java.sql.*;

public class PGConnection {
	public Connection getConnection() throws ClassNotFoundException {
		String connectionUrl = "jdbc:postgresql://192.168.100.196:5432/asterisk";

		try {
			Class.forName("org.postgresql.Driver");
			return DriverManager.getConnection(connectionUrl, "postgres", "admin");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
