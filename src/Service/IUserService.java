package Service;

import domain.User;

public interface IUserService {

	//add registered user to db
	public void addUser(User user);
	
	//get user
	public User getUserById();
	
	//validation
	public User validateUser(String userName, String passWord);
	
	//check existence of User
	public boolean isUserExist(String userName);
}
