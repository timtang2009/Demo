package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {
	public static void testInsert() {
		try {
			// �������ݿ�������ע�ᵽ����������
			Class.forName("com.mysql.jdbc.Driver");
			// ���ݿ������ַ���
			String url = "jdbc:mysql://localhost:3306/community";
			// ���ݿ��û���
			String username = "root";
			// ���ݿ�����
			String password = "1234";
			// ����Connection����
			Connection conn = DriverManager.getConnection(url, username,
					password);
			// �ж� ���ݿ������Ƿ�Ϊ��
			Statement statement = conn.createStatement();
			//String insertSQL = "INSERT INTO diary(title, content, authorName, time)"
				//	+ "VALUES('��ƪ�ռ�','����ƪ����', 'java������3', NOW())";
			String insertSQL = "INSERT INTO testcase(id, title, content, authorName)"
					+ "VALUES(21, '21-Fourth Diary', '21-The content of Fourth Diary', '21-JavaLearner4')";
			int count = statement.executeUpdate(insertSQL);
			System.out.println("�ɹ�������" + count + "������");
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
			// �������ݿ�������ע�ᵽ����������
			Class.forName("com.mysql.jdbc.Driver");
			// ���ݿ������ַ���
			String url = "jdbc:mysql://localhost:3306/community";
			// ���ݿ��û���
			String username = "root";
			// ���ݿ�����
			String password = "1234";
			// ����Connection����
			Connection conn = DriverManager.getConnection(url, username,
					password);
			// �ж� ���ݿ������Ƿ�Ϊ��
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
				System.out.println("��"+id+"ƪ�ռǵ������ǣ� "+authorName);
				System.out.println("��"+id+"ƪ�ռǵı����ǣ� "+title);
				System.out.println("��"+id+"ƪ�ռǵ������ǣ� "+content);
				//System.out.println("��"+id+"ƪ�ռǵ�ʱ���ǣ� "+year+"-"+month+"-"+day+"-"+hour+"-"+minute);
				
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
