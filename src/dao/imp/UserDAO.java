package dao.imp;

import java.sql.SQLException;
import java.util.List;

import dao.IUserDAO;
import domain.User;

public class UserDAO implements IUserDAO {

	public UserDAO() {
		
	}
	
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		DatabaseDAO myDB = new DatabaseDAO();
		String sql = "insert into user(UserName, Password, RealName, Gender, age, "
				+ "PersonalSignature) values('"+user.getUserName()+"','"+user.getPassword()+
				"','"+user.getRealName()+"','"+user.getGender()+"','"+user.getAge()+
				",'"+user.getPersonalSignature()+"')";
		try {
			myDB.executeSQL(sql);
		}catch(SQLException sqlEx) {
			sqlEx.printStackTrace();
		}catch(ClassNotFoundException cnfEx) {
			cnfEx.printStackTrace();
		}
	}

	@Override
	public User getUserByID(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUserByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

}
