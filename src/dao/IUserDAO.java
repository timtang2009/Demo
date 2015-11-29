package dao;

import java.util.List;

import domain.User;

public interface IUserDAO {
	public void addUser(User user);

	public User getUserByID(String id);

	public List<User> getUserByUserName(String userName);
}
