package br.com.md.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.ibm.db2.jcc.am.Connection;

public class DB2Connection {
	public Connection getConnection() {
		try {
			//Class.forName("com.ibm.db2.jcc.DB2Driver");
			return (Connection) DriverManager.getConnection("jdbc:db2://192.168.100.64/COBRA","db2inst1","programador123");
		}catch (SQLException e){
			throw new RuntimeException(e);
		}
	}
}
