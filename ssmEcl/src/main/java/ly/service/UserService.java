package ly.service;

import ly.entity.User;

public interface UserService {
	public User getUserByID(Integer id);
	public Boolean login(String uname,String upassword);
	public User addUser(User user);
	
}
