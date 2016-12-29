package br.com.md.teste;

import java.sql.*;

import br.com.md.jdbc.DB2Connection;
import br.com.md.jdbc.SQLServerConnection;
import br.com.md.jdbc.PGConnection;

public class TestaConexao {

	public TestaConexao() throws SQLException{
	}

	public boolean TestarDB2() throws SQLException{
		Connection db2 = new DB2Connection().getConnection();
		db2.close();		
		return true;
	}
	public boolean TestarSQLServer() throws SQLException, ClassNotFoundException{
		Connection sql = new SQLServerConnection().getConnection();
		sql.close();		
		return true;
	}
	public boolean TestarPostgreSQL() throws SQLException, ClassNotFoundException{
		Connection pg = new PGConnection().getConnection();
		pg.close();		
		return true;
	}
}
