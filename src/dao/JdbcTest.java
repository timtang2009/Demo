package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {
	public static void testInsert() {
		try {
			// 加载数据库驱动，注册到驱动管理器
			Class.forName("com.mysql.jdbc.Driver");
			// 数据库连接字符串
			String url = "jdbc:mysql://localhost:3306/community";
			// 数据库用户名
			String username = "root";
			// 数据库密码
			String password = "1234";
			// 创建Connection连接
			Connection conn = DriverManager.getConnection(url, username,
					password);
			// 判断 数据库连接是否为空
			Statement statement = conn.createStatement();
			//String insertSQL = "INSERT INTO diary(title, content, authorName, time)"
				//	+ "VALUES('三篇日记','第三篇内容', 'java爱好者3', NOW())";
			String insertSQL = "INSERT INTO testcase(id, title, content, authorName)"
					+ "VALUES(21, '21-Fourth Diary', '21-The content of Fourth Diary', '21-JavaLearner4')";
			int count = statement.executeUpdate(insertSQL);
			System.out.println("成功插入了" + count + "条数据");
			statement.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void testSelect() {
		try {
			// 加载数据库驱动，注册到驱动管理器
			Class.forName("com.mysql.jdbc.Driver");
			// 数据库连接字符串
			String url = "jdbc:mysql://localhost:3306/community";
			// 数据库用户名
			String username = "root";
			// 数据库密码
			String password = "1234";
			// 创建Connection连接
			Connection conn = DriverManager.getConnection(url, username,
					password);
			// 判断 数据库连接是否为空
			Statement statement = conn.createStatement();
			String selectSQL = "SELECT * FROM testcase";
			ResultSet resultSet = statement.executeQuery(selectSQL);
			while(resultSet.next()) {
				int id = resultSet.getInt("id");
				String authorName = resultSet.getString("authorName");
				String title = resultSet.getString("title");
				String content = resultSet.getString("content");
				/*Date time = resultSet.getTime("time");
				GregorianCalendar gc = new GregorianCalendar();
				gc.setTime(time);
				
				int year = gc.get(GregorianCalendar.YEAR);
				int month = gc.get(GregorianCalendar.MONTH);
				int day = gc.get(GregorianCalendar.DATE);
				int hour = gc.get(GregorianCalendar.HOUR_OF_DAY);
				int minute = gc.get(GregorianCalendar.MINUTE);*/
				
				System.out.println("The id is: " + id);
				System.out.println("第"+id+"篇日记的作者是： "+authorName);
				System.out.println("第"+id+"篇日记的标题是： "+title);
				System.out.println("第"+id+"篇日记的内容是： "+content);
				//System.out.println("第"+id+"篇日记的时间是： "+year+"-"+month+"-"+day+"-"+hour+"-"+minute);
				
			}
			statement.close();
			conn.close();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		testInsert();
		testSelect();
	}
}
