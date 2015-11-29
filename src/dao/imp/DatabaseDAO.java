package dao.imp;

import java.sql.*;

public class DatabaseDAO {
	private Connection conn = null;

	public Connection getConnection() throws ClassNotFoundException,
			SQLException {
		Connection conn = null;
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/community";
		// 数据库用户名
		String username = "root";
		// 数据库密码
		String password = "1234";
		conn = DriverManager.getConnection(url, username, password);
		System.out.println("Connection Created!");
		return conn;
	}

	public void releaseConnection() throws SQLException {
		this.conn.close();
		this.conn = null;
	}

	public ResultSet getResultSet(String querySQL) throws SQLException,
			ClassNotFoundException {
		if (conn == null) {
			this.conn = getConnection();
		}
		Statement stm = conn.createStatement();
		ResultSet thisRST = stm.executeQuery(querySQL);
		return thisRST;
	}

	public void executeSQL(String SQL) throws SQLException,
			ClassNotFoundException {
		if (conn == null) {
			this.conn = getConnection();
		}
		Statement stm = conn.createStatement();
		stm.executeUpdate(SQL);
		this.conn.close();
		this.conn = null;
	}

	public static void main(String[] args) {
		DatabaseDAO myDb = new DatabaseDAO();
		try {
			myDb.conn = myDb.getConnection();
			myDb.releaseConnection();
		} catch (SQLException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}
}
